package com.sonata.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Doctor { 
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
long docId;
String Dname;
int Age;
String Email;
String phNumber;
String Specialization;



Doctor(){}

Doctor(long docid, String Dname, int age,String email,String phnumber,String specialization)

{
this.docId=docid;
this.Dname =Dname;
this.Age = age;
this.Email=email;
this.phNumber=phnumber;
this.Specialization=specialization;
}
public long getDocId() {
	return docId;
}

public void setDocId(long docId) {
	this.docId = docId;
}

public String getDname() {
	return Dname;
}

public void setDname(String dname) {
	Dname = dname;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPhNumber() {
	return phNumber;
}

public void setPhNumber(String phNumber) {
	this.phNumber = phNumber;
}

public String getSpecialization() {
	return Specialization;
}

public void setSpecialization(String specialization) {
	Specialization = specialization;
}

@Override
public String toString() {
	return "Doctor [docId=" + docId + ", Dname=" + Dname + ", Age=" + Age + ", Email=" + Email + ", phNumber="
			+ phNumber + ", Specialization=" + Specialization + ", getDocId()=" + getDocId() + ", getDname()="
			+ getDname() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + ", getPhNumber()=" + getPhNumber()
			+ ", getSpecialization()=" + getSpecialization() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}


}
