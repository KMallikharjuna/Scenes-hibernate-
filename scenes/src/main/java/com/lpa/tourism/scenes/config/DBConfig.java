package com.lpa.tourism.scenes.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfig {
	public static Session session;
	
	public DBConfig() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		session = sf.openSession();
	}
	
	public Session getSession() {
		return session;
	}
}
