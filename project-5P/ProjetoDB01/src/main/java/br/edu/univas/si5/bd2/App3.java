package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Employee;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App3 {
	
	public static void main(String[] args) {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		Employee epl = new Employee();
		epl.setName("Eduardo");
		epl.setSex("M");
		epl.setAge(18);
		epl.setBirthday(new Date());
		
		em.getTransaction().begin();
        em.persist(epl);
        em.getTransaction().commit();

	}

}
