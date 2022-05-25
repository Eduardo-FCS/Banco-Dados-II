package br.edu.univas.si5.bd2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
	
}
