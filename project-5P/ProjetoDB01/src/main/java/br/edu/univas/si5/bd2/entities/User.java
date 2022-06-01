package br.edu.univas.si5.bd2.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {
	
	@Id
	private String username;
	private String password;
	private boolean active;
	
	@OneToOne(mappedBy="user")
	private  Employee employee;
	
	public User() {
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", active=" + active + "]";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	 
	 
}
