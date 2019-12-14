package com.web.Util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.web.Model.*;
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			try {
				Configuration config=new Configuration();
				
				//Properties for Configuring Hibernate
				//This is equivalent to hibernate cfg xml file
				Properties settings =new Properties();
				settings.put(Environment.DRIVER,"com.microsoft.sqlserver.jdbc.SQLServerDriver");
				settings.put(Environment.URL,"jdbc:sqlserver://10.0.0.39/SQLEXPRESS:1433/EmpMan?useSSL=false");
				settings.put(Environment.USER, "sa");
				settings.put(Environment.PASS, "admin123");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
				
				settings.put(Environment.SHOW_SQL,"true");
				
				config.setProperties(settings);
				
				config.addAnnotatedClass(EmpModel.class);
				
				ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
						.applySettings(config.getProperties()).build();
				
				sessionFactory=config.buildSessionFactory(serviceRegistry);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
	

}
