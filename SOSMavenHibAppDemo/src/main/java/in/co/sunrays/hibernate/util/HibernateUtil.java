package in.co.sunrays.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Util class to create SessionFactory
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * Static block builds Session Factory from hibernate.cfg.xml file
	 * 
	 * @return
	 */
	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	/**
	 * Returns SessionFactory singleton object
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
