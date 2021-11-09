package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Patientfeedback {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
long feedbackId;
int docId;
int patId;
String Feedback;
String Date;

Patientfeedback(){}

public Patientfeedback(long feedbackId, int docId, int patId, String feedback, String date) {
	super();
	this.feedbackId = feedbackId;
	this.docId = docId;
	this.patId = patId;
	Feedback = feedback;
	Date = date;
}

public long getFeedbackId() {
	return feedbackId;
}

public void setFeedbackId(long feedbackId) {
	this.feedbackId = feedbackId;
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

public String getFeedback() {
	return Feedback;
}

public void setFeedback(String feedback) {
	Feedback = feedback;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

@Override
public String toString() {
	return "Patientfeedback [feedbackId=" + feedbackId + ", docId=" + docId + ", patId=" + patId + ", Feedback="
			+ Feedback + ", Date=" + Date + ", getFeedbackId()=" + getFeedbackId() + ", getDocId()=" + getDocId()
			+ ", getPatId()=" + getPatId() + ", getFeedback()=" + getFeedback() + ", getDate()=" + getDate()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}







}