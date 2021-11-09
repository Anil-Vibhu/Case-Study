package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Prescription {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
long slotId;
String prescription;


Prescription(){}


public Prescription(long slotId, String prescription) {
	super();
	this.slotId = slotId;
	this.prescription = prescription;
}


public long getSlotId() {
	return slotId;
}


public void setSlotId(long slotId) {
	this.slotId = slotId;
}


public String getPrescription() {
	return prescription;
}


public void setPrescription(String prescription) {
	this.prescription = prescription;
}


@Override
public String toString() {
	return "Prescription [slotId=" + slotId + ", prescription=" + prescription + ", getSlotId()=" + getSlotId()
			+ ", getPrescription()=" + getPrescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}




}
