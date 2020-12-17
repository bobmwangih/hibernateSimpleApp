package com.clc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.setAdmno(800);
		st.setFullname("Vasco da Gama");
		st.setGender("female");
		st.setEmail("vasco@tembeaKenya.com");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		session.close();
	}

}
