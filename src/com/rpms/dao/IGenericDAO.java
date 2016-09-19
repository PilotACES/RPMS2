package com.rpms.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;

import com.rpms.utils.PageUtil;

public interface IGenericDAO<T extends Serializable, PK extends Serializable> {

	// ����������ȡʵ�塣���û����Ӧ��ʵ�壬���� null��
	public T get(PK id);

	// ����������ȡʵ�塣���û����Ӧ��ʵ�壬�׳��쳣��
	public T load(PK id);

	// ��ȡȫ��ʵ�塣
	public List<T> loadAll();

	// ����ʵ��
	public void update(T entity);

	// ���ʵ��
	public void save(T entity);

	// ���ӻ����ʵ��
	public void saveOrUpdate(T entity);

	// ɾ��ָ����ʵ��
	public void delete(T entity);

	// ��������ɾ��ָ��ʵ��
	public void deleteByKey(PK id);

	// ɾ�������е�ȫ��ʵ��
	public void deleteAll(Collection<T> entities);

	// ʹ��HSQL����������
	public List find(String queryString);

	// ʹ�ô�������HSQL����������
	public List find(String queryString, Object[] values);

	// ʹ�ô������Ĳ�����HSQL����������
	public List findByNamedParam(String queryString, String[] paramNames,
			Object[] values);

	// ʹ��ָ���ļ�����׼�������ݣ����ز��ּ�¼
	public List findByCriteria(DetachedCriteria criteria, int firstResult,
			int maxResults);

	public PageUtil fenye(int pageNum, int pageSize);
	
	public PageUtil fenyeEqualByEntity(int pageNum,int pageSize,String propertyName,String propertyValue);

	// ʹ��ָ����ʵ�弰���Լ�������������������ԣ�ʵ��ֵ������
	public List<T> findEqualByEntity(T entity, String[] propertyNames);

	// ʹ��ָ����ʵ�弰����(������)�������������� like ��ʵ��ֵ������
	public List<T> findLikeByEntity(T entity, String[] propertyNames);

	// ʹ��ָ���ļ�����׼�������ݣ�����ָ����Χ�ļ�¼
	public Integer getRowCount(DetachedCriteria criteria);

	// ʹ��ָ���ļ�����׼�������ݣ�����ָ��ͳ��ֵ
	public Object getStatValue(DetachedCriteria criteria, String propertyName,
			String StatName);

	// ������Ự�޹صļ�����׼����
	public DetachedCriteria createDetachedCriteria();

	// ������Ự�󶨵ļ�����׼����
	public Criteria createCriteria();

}
