package com.rpms.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSessionFactory {

	private static Configuration cfg;

	// 会话工厂
	private static SessionFactory sessionFactory;

	// 装session容器
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	static {
		cfg = new Configuration().configure();// 获取hibernate.cfg.xml文件
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		ServiceRegistry registry = builder.buildServiceRegistry();
		SessionFactory sessionFactory = cfg.buildSessionFactory(registry);
	}

	public static Session getSession() {
		Session session = threadLocal.get();
		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}

	private static void rebuildSessionFactory() {
		cfg = new Configuration().configure();// 获取hibernate.cfg.xml文件
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		ServiceRegistry registry = builder.buildServiceRegistry();
		SessionFactory sessionFactory = cfg.buildSessionFactory(registry);
	}
	
	public static void closeSession(){
		Session session=threadLocal.get();
		if(session!=null){
			session.close();
		}
	}

}
