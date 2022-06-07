package br.edu.univas.si5.bd2.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManager getEntityManager() {

		EntityManagerFactory emFactory = null;

		try {
			// Create the Factory
			emFactory = Persistence.createEntityManagerFactory("bd2_PU");
		} catch (Throwable e) {
			System.err.println("Error creating EntityManagerFactory ." + e);
			throw new ExceptionInInitializerError(e);
		}
		return emFactory.createEntityManager();
	}
}