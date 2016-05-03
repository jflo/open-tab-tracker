package com.twoewe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClueSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String usersEmail;
	private String clientName;
	private float percentTimeSpent;
	private int weekNumber;
	
	public String getUsersEmail() {
		return usersEmail;
	}
	public void setUsersEmail(String usersEmail) {
		this.usersEmail = usersEmail;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public float getPercentTimeSpent() {
		return percentTimeSpent;
	}
	public void setPercentTimeSpent(float percentTimeSpent) {
		this.percentTimeSpent = percentTimeSpent;
	}
	public int getWeekNumber() {
		return weekNumber;
	}
	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}
	
	
}
