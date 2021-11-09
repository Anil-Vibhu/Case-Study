package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Disease {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
long disId;
String disName;

Disease(){}

public Disease(long disId, String disName) {
	super();
	this.disId = disId;
	this.disName = disName;
}

public long getDisId() {
	return disId;
}

public void setDisId(long disId) {
	this.disId = disId;
}

public String getDisName() {
	return disName;
}

public void setDisName(String disName) {
	this.disName = disName;
}

@Override
public String toString() {
	return "Disease [disId=" + disId + ", disName=" + disName + ", getDisId()=" + getDisId() + ", getDisName()="
			+ getDisName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}



}