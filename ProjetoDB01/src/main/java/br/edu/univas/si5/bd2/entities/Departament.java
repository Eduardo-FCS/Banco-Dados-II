package br.edu.univas.si5.bd2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departament {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto-increment
	private Integer code;
	private String name;
	
	public Departament() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
