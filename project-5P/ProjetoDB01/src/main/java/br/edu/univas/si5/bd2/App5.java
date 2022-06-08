package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Employee;
import br.edu.univas.si5.bd2.entities.User;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App5 {
	
	public static void main(String[] args) {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		Cargo cargo = em.find(Cargo.class, 3);
		if(cargo == null) {
			System.out.println("Cargo 3 is null");
			return;
		}
		
		User user = em.find(User.class, "User test");
		if(user==null) {
			System.out.println("Usuário \"UserTest\" é null");
			return;
		}
		
		Employee epl = new Employee();
		epl.setName("Marcio");
		epl.setSex("M");
		
		epl.setUser(user);
		epl.setCargo(cargo);
		
		em.getTransaction().begin();
		em.persist(epl);
		em.getTransaction().commit();
		
		System.out.println("Código do funcionário:" + epl.getRecord());
		
		/*User user = new User();
		user.setActive(true);
		user.setUsername("Usertest");
		user.setPassword("1232456");
		
		Employee epl = new Employee();
		epl.setName("fernanda");
		epl.setSex("f");
		epl.setAge(19);
		epl.setBirthday(new Date());
		epl.setUser(user);
		epl.setCargo(cargo);
		
		em.getTransaction().begin();
        em.persist(user);
        em.persist(epl);
        em.getTransaction().commit();*/
        
	}

}
