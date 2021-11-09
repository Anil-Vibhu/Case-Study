package com.sonata.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Patient1 {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
private long patId;
private String Name;
private int Age;
private String Sex;
private String Email;
private String phoneNumber;
private String bloodGroup;

Patient1(){}

Patient1(long patid, String name, int age,String sex,String email,String phonenumber,String bloodgroup)

{
this.patId=patid;
this.Name =name;
this.Age = age;
this.Sex=sex;
this.Email=email;
this.phoneNumber=phonenumber;
this.bloodGroup=bloodgroup;
}

public long getPatId() {
	return patId;
}

public void setPatId(long patId) {
	this.patId = patId;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public String getSex() {
	return Sex;
}

public void setSex(String sex) {
	Sex = sex;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getBloodGroup() {
	return bloodGroup;
}

public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}

@Override
public String toString() {
	return "Patient1 [patId=" + patId + ", Name=" + Name + ", Age=" + Age + ", Sex=" + Sex + ", Email=" + Email
			+ ", phoneNumber=" + phoneNumber + ", bloodGroup=" + bloodGroup + ", getPatId()=" + getPatId()
			+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSex()=" + getSex() + ", getEmail()="
			+ getEmail() + ", getPhoneNumber()=" + getPhoneNumber() + ", getBloodGroup()=" + getBloodGroup()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}







}