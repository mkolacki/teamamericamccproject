package com.bah.msd.ta.mcc.domain;

import java.util.Date;

public class Registration {
	long id;
	String eventID;
	String customerID;
	Date registrationDate;
	String notes;
	
	public Registration() {
		
	}
	
	public Registration(long id, String eventID, String customerID, Date registrationDate, String notes) {
		super();
		this.id = id;
		this.eventID = eventID;
		this.customerID = customerID;
		this.registrationDate = registrationDate;
		this.notes = notes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
