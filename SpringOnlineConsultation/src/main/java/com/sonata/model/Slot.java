package com.sonata.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Slot {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
long slotId;
int docId;
int patId;
int disId;
String Date;
String startTime;
String endTime; 


Slot(){}


public Slot(long slotId, int docId, int patId, int disId, String date,String startTime,String endTime) {
	
	this.slotId = slotId;
	this.docId = docId;
	this.patId = patId;
	this.disId = disId;
	this.startTime =startTime;
	this.endTime = endTime;
}


public long getSlotId() {
	return slotId;
}


public void setSlotId(long slotId) {
	this.slotId = slotId;
}


public int getDocId() {
	return docId;
}


public void setDocId(int docId) {
	this.docId = docId;
}


public int getPatId() {
	return patId;
}


public void setPatId(int patId) {
	this.patId = patId;
}


public int getDisId() {
	return disId;
}


public void setDisId(int disId) {
	this.disId = disId;
}


public String getDate() {
	return Date;
}


public void setDate(String date) {
	this.Date = date;
}


public String getStartTime() {
	return startTime;
}


public void setStartTime(String startTime) {
	this.startTime = startTime;
}


public String getEndTime() {
	return endTime;
}


public void setEndTime(String endTime) {
	this.endTime = endTime;
}


@Override
public String toString() {
	return "Slot [slotId=" + slotId + ", docId=" + docId + ", patId=" + patId + ", disId=" + disId + ", Date=" + Date
			+ ", startTime=" + startTime + ", endTime=" + endTime + ", getSlotId()=" + getSlotId() + ", getDocId()="
			+ getDocId() + ", getPatId()=" + getPatId() + ", getDisId()=" + getDisId() + ", getDate()=" + getDate()
			+ ", getStartTime()=" + getStartTime() + ", getEndTime()=" + getEndTime() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}




