package br.edu.univas.si5.bd2.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POSITION")
public class Cargo implements Serializable {
	@Id
	@Column(name="CODE")
	private Integer codigo;
	
	@Column(name="NAME")
	private String nome;
	
	@Column(name="WAGE")
	private float salario;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoCargo type;

	public Cargo() {
		// TODO Auto-generated constructor stub
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public TipoCargo getType() {
		return type;
	}


	public void setType(TipoCargo type) {
		this.type = type;
	}
	
}
