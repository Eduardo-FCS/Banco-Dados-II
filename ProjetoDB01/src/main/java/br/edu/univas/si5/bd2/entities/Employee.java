package br.edu.univas.si5.bd2.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
					generator="regSeqGenerator")
	@SequenceGenerator(name="regSeqGenerator",
						sequenceName="seq_employee", //sequência do banco
						allocationSize=1)
	private Integer record;
	private String name;
	

	private String sex;
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;
	@Transient
	private int age;
	
	@OneToOne
	@JoinColumn(name="USER_FK")
	private User user;
	
	@ManyToOne 
	@JoinColumn(name="CARGO_FK") //define a FK 
	private Cargo cargo;
	
	public Employee() {}

	public Integer getRecord() {
		return record;
	}

	public void setRecord(Integer record) {
		this.record = record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
}
