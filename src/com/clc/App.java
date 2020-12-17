package com.clc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Students st = new Students();
		st.setAdmno(807);
		st.setFullname("Vasco da Gama");
		st.setGender("female");
		st.setEmail("vasco@tembeaKenya.com");
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		//session.save(st);
		session.getTransaction().commit();
		session.close();
		
		st = null;
		session =sf.openSession();
		session.beginTransaction();
		st = (Students) session.get(Students.class,807);
		System.out.println(st.getAdmno());
		System.out.println(st.getFullname());
		System.out.println(st.getEmail());
	}

}
