package com.rpms.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.rpms.dao.IGenericDAO;
import com.rpms.utils.PageUtil;

public class genericHibernateDAO<T extends Serializable, PK extends Serializable>
extends HibernateDaoSupport implements IGenericDAO<T, PK> {
	
	private Class<T> entityClass;
	
	public genericHibernateDAO() {
		Class c=getClass();
		Type t=c.getGenericSuperclass();
		if(t instanceof ParameterizedType){
			Type[] p=((ParameterizedType) t).getActualTypeArguments();
			this.entityClass=(Class<T>)p[0];
		}
	}

	public T get(PK id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(entityClass, id);
	}

	public T load(PK id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().load(entityClass, id);
	}

	public List<T> loadAll() {
		return getHibernateTemplate().loadAll(entityClass);
	}

	public void update(T entity) {
		getHibernateTemplate().update(entity);
		
	}

	public void save(T entity) {
		getHibernateTemplate().save(entity);
		
	}

	public void saveOrUpdate(T entity) {
		getHibernateTemplate().saveOrUpdate(entity);
		
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
		
	}

	public void deleteByKey(PK id) {
		this.delete(this.load(id));
		
	}

	public void deleteAll(Collection<T> entities) {
		getHibernateTemplate().deleteAll(entities);
		
	}

	public List find(String queryString) {
		return getHibernateTemplate().find(queryString);
	}

	public List find(String queryString, Object[] values) {
		return getHibernateTemplate().find(queryString, values);
	}

	public List findByNamedParam(String queryString, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	public List findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults) {
		return getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		int totalNum=getRowCount(createDetachedCriteria());
		int totalPage=(int) Math.ceil((double)totalNum/pageSize);
		int first=1;
		int previous=pageNum>0?pageNum-1:1;
		int next=pageNum<totalPage?pageNum+1:totalNum;
		int last=totalPage;
		DetachedCriteria criteria=createDetachedCriteria();
		criteria.addOrder(Order.asc("id"));
		List date=this.findByCriteria(criteria, pageSize*(pageNum-1), pageSize);
		PageUtil page=new PageUtil(pageSize, pageNum, totalNum, totalPage, first, previous, next, last, date);
		return page;
	}

	public PageUtil fenyeEqualByEntity(int pageNum,int pageSize, String propertyName, String propertyValue) {
		int totalNum=getRowCount(createDetachedCriteria().add(Restrictions.eq(propertyName, propertyValue)));
		int totalPage=(int)Math.ceil((double)totalNum/pageSize);
		int first=1;
		int previous=pageNum>0?pageNum-1:1;
		int next=pageNum<totalPage?pageNum+1:totalNum;
		int last=totalPage;
		DetachedCriteria criteria=createDetachedCriteria();
		Criterion criterion=Restrictions.eq(propertyName, propertyValue);
		criteria.add(criterion);
		List date=this.findByCriteria(criteria, pageSize*(pageNum-1), pageSize);
		PageUtil page=new PageUtil(pageSize, pageNum, totalNum , totalPage, first, previous, next, last, date);
		return page;
	}
	
	public List<T> findEqualByEntity(T entity, String[] propertyNames) {
		Criteria criteria=this.createCriteria();
		Example exam=Example.create(entity);
		exam.excludeZeroes();
		String[] defProperties = getSessionFactory().getClassMetadata(entityClass).getPropertyNames();
		for(String defProperty:defProperties){
			int i=0;
			for(i=0;i<propertyNames.length;++i){
				if(defProperty.equals(propertyNames[i])){
					criteria.addOrder(Order.asc(defProperty));
					break;
				}
			}
			if(i==propertyNames.length){
				exam.excludeProperty(defProperty);
			}
		}
		criteria.add(exam);
		return (List<T>)criteria.list();
	}

	public List<T> findLikeByEntity(T entity, String[] propertyNames) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getRowCount(DetachedCriteria criteria) {
		criteria.setProjection(Projections.rowCount());
		List list=this.findByCriteria(criteria, 0, 1);
		return (Integer)list.get(0);
	}

	public Object getStatValue(DetachedCriteria criteria, String propertyName, String StatName) {
		if (StatName.toLowerCase().equals("max"))
			criteria.setProjection(Projections.max(propertyName));
		else if (StatName.toLowerCase().equals("min"))
			criteria.setProjection(Projections.min(propertyName));
		else if (StatName.toLowerCase().equals("avg"))
			criteria.setProjection(Projections.avg(propertyName));
		else if (StatName.toLowerCase().equals("sum"))
			criteria.setProjection(Projections.sum(propertyName));
		else
			return null;
		List list = this.findByCriteria(criteria, 0, 1);
		return list.get(0);
	}

	public DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(this.entityClass);
	}

	public Criteria createCriteria() {
		return this.createDetachedCriteria().getExecutableCriteria(this.getSessionFactory().getCurrentSession());
	}


}
