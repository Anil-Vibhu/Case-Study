package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Doctorlogin{
@Id

long docId;
String Password;

Doctorlogin(){}

public Doctorlogin(long docId, String password) {
	super();
	this.docId = docId;
	Password = password;
}

public long getDocId() {
	return docId;
}

public void setDocId(long docId) {
	this.docId = docId;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

@Override
public String toString() {
	return "Doctorlogin [docId=" + docId + ", Password=" + Password + ", getDocId()=" + getDocId() + ", getPassword()="
			+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}






}
