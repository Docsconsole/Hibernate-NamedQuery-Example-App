package com.docsconsole.tutorials.hibernate5.client;


import com.docsconsole.tutorials.hibernate5.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.docsconsole.tutorials.hibernate5.util.HibernateUtil;

import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;

public class MainClient {

	public static void main(String[] args) {

		System.out.println("Main method@MainClient");

		try {

			// Get Session
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Session is created");

			// start transaction
			Transaction tx = session.beginTransaction();
			TypedQuery query = session.getNamedQuery("findPersonByName");
			query.setParameter("firstName","William");

			List<Person> persons=query.getResultList();

			Iterator<Person> itr = persons.iterator();
			while(itr.hasNext()){
				Person p = itr.next();
				System.out.println(p.getFirstName());
				System.out.println(p.getLastName());
			}
			tx.commit();
			//session.close();
			System.out.println("Session is closed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}