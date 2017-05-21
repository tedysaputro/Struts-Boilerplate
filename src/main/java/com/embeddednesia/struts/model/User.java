package com.embeddednesia.struts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity()
@Table(name="user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User {

	@Id
	@Column(name ="ID", length = 100, nullable = false)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	public User() {
	}

	public User(int id, String name, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + userName
				+ ", password=" + password + "]";
	}

}
