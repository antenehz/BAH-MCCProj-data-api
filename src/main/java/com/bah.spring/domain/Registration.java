package com.bah.spring.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import javax.persistence.Id;

@Document(collection="REGISTRATIONS")
public class Registration {

	@Id
	String id;

	String event_id;

	String customer_id;
	
	Date registration_date;
	
	String notes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString(){
		return "Registration [id:" + id + ", customer_id:" + customer_id + ", registration_date:" + registration_date + ", notes:" + notes + "]";
	}
	
}
