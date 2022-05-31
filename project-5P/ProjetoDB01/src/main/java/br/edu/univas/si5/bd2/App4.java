package br.edu.univas.si5.bd2;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Departament;
import br.edu.univas.si5.bd2.entities.Employee;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App4 {
	
	public static EntityManager em = HibernateUtil.getEntityManager();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0;; i++) {
			menu();
			int choice = scanner.nextInt();
			if (choice >= 1 && choice <= 3) {
				if (choice == 1) {
					consult();
					break;
				} else if (choice == 2) {
					update();
					break;
				} else if (choice == 3) {
					delete();
					break;
				}
			} else {
				error();
			}
		}
	}

	public static void consult() {
		
		Cargo objCargo = em.find(Cargo.class, 1); // busca cargo com pk 1
		System.out.println("Cargo: " + objCargo);

		Departament objDep = em.find(Departament.class, 1);// busca dep com pk 1
		System.out.println("Departament: " + objDep);

		Employee objFun = em.find(Employee.class, 1);// busca func com pk 1

		if (objFun == null) {
			System.out.println("Doesn't have code with 1. objFun is null.");
		} else {
			System.out.println("Employee: " + objFun);
		}
	}
	
	public static void update() {
	
		int pkCargo = 1;
		Cargo objCargo = em.find(Cargo.class, pkCargo);// busca o cargo pela pk
		if (objCargo != null) { // se achar, faz update
		objCargo.setNome("Gerente"); // modifica o nome e salário
		objCargo.setSalario(5000f);
		em.getTransaction().begin();
		em.merge(objCargo); // faz o update
		em.getTransaction().commit();
		} else {
		System.out.println("Cargo " + pkCargo + " não encontrado.");
		}

	}
	
	public static void delete() {
		int pkCargo = 1;
		Cargo objCargo = em.find(Cargo.class, pkCargo);// busca o cargo pela pk
		if (objCargo != null) { // se achar, faz delete
		em.getTransaction().begin();
		em.remove(objCargo); // remove o cargo
		em.getTransaction().commit();
		} else {
		System.out.println("Cargo " + pkCargo + " não encontrado.");
		}

	}

	public static void menu() {
		System.out.println("Enter the number " + "of the operation you want " + "to perform below");
		System.out.println("1- Consult" +  "\n" + "2- Update" +  "\n" + "3- Delete" + "\n");
	}

	public static void error() {
		System.out.println("Incorret choice, please choice again!");
	}
}
