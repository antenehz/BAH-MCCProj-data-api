package com.bah.spring.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

@Document(collection="CUSTOMERS")
public class Customer {
	@Id
	private ObjectId id;

	private String name;

	private String password;

	private String email;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString(){
		return "Customer [id:" + id + ", name:" + name + ", pass:" + password + ", email:" + email + "]";
	}
}
