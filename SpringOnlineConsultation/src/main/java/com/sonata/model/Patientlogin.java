package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Patientlogin{
@Id

long patId;
String Password;

Patientlogin(){}
public Patientlogin(long patId, String password) {
	super();
	this.patId = patId;
	Password = password;
}
public long getPatId() {
	return patId;
}
public void setPatId(long patId) {
	this.patId = patId;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public String toString() {
	return "Patientlogin [patId=" + patId + ", Password=" + Password + ", getPatId()=" + getPatId() + ", getPassword()="
			+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}








}


