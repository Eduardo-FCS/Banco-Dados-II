package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Employee;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App3 {
	
	public static void main(String[] args) {
		
		Employee epl = new Employee();
		epl.setName("Eduardo");
		epl.setSex("M");
	
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
        em.persist(epl);
        em.getTransaction().commit();
	}

}
