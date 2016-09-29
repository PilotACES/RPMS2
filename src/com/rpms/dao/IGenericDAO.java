package com.rpms.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;

import com.rpms.utils.PageUtil;

public interface IGenericDAO<T extends Serializable, PK extends Serializable> {

	// 根据主键获取实体。如果没有相应的实体，返回 null。
	public T get(PK id);

	// 根据主键获取实体。如果没有相应的实体，抛出异常。
	public T load(PK id);

	// 获取全部实体。
	public List<T> loadAll();

	// 更新实体
	public void update(T entity);

	// 添加实体
	public void save(T entity);

	// 增加或更新实体
	public void saveOrUpdate(T entity);

	// 删除指定的实体
	public void delete(T entity);

	// 根据主键删除指定实体
	public void deleteByKey(PK id);

	// 删除集合中的全部实体
	public void deleteAll(Collection<T> entities);

	// 使用HSQL语句检索数据
	public List find(String queryString);

	// 使用带参数的HSQL语句检索数据
	public List find(String queryString, Object[] values);

	// 使用带命名的参数的HSQL语句检索数据
	public List findByNamedParam(String queryString, String[] paramNames,
			Object[] values);

	// 使用指定的检索标准检索数据，返回部分记录
	public List findByCriteria(DetachedCriteria criteria, int firstResult,
			int maxResults);

	public PageUtil fenye(int pageNum, int pageSize);
	
	public PageUtil fenyeEqualByEntity(int pageNum,int pageSize,String propertyName,String propertyValue);
	
	public PageUtil fenyeManyToOne(int pageNum,int pageSize,String propertyName,String propertyValue);

	// 使用指定的实体及属性检索（满足除主键外属性＝实体值）数据
	public List<T> findEqualByEntity(T entity, String[] propertyNames);

	// 使用指定的实体及属性(非主键)检索（满足属性 like 串实体值）数据
	public List<T> findLikeByEntity(T entity, String[] propertyNames);

	// 使用指定的检索标准检索数据，返回指定范围的记录
	public Integer getRowCount(DetachedCriteria criteria);

	// 使用指定的检索标准检索数据，返回指定统计值
	public Object getStatValue(DetachedCriteria criteria, String propertyName,
			String StatName);

	// 创建与会话无关的检索标准对象
	public DetachedCriteria createDetachedCriteria();

	// 创建与会话绑定的检索标准对象
	public Criteria createCriteria();

}
