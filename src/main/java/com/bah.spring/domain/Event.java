package com.bah.spring.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Document(collection="EVENTS")
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String id;
	
	@Column(name="EVENT_CODE")
	String code;
	
	String title;
	
	String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString(){
		return "Event [id:" + id + ", code:" + code + ", title:" + title + ", description:" + description + "]";
	}
	
}
