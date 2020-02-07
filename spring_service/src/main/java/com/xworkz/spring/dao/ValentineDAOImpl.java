package com.xworkz.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.spring.entity.ValentineEntity;

@Component
public class ValentineDAOImpl implements ValentineDAO{
	
	public ValentineDAOImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public Integer save(ValentineEntity entity) {
		try {
			
			Configuration cfg = new Configuration();
			cfg.configure("mysql.xml");
			cfg.addAnnotatedClass(ValentineEntity.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = ((org.hibernate.SessionFactory) factory).openSession();
					System.out.println("transaction started");
			session.beginTransaction();
		
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("transaction committed");
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	}
