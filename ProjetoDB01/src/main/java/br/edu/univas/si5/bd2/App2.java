package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Departament;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App2 {
	
	public static void main(String[] args) {
		
		Departament dep = new Departament();
		dep.setName("Sales");
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
        em.persist(dep);
        em.getTransaction().commit();
	}

}
