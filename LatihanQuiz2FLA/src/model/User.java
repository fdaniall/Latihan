package model;

import state.State;
import state.UserFirstState;

public class User {
	String name;
	String jobpref;
	String randomCode = "";
	State statusForm;
	int jobex;
	
	public User(String name, String jobpref, String randomCode, int jobex) {
		super();
		this.name = name;
		this.jobpref = jobpref;
		this.randomCode = randomCode;
		this.jobex = jobex;
		
		statusForm = new UserFirstState();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobpref() {
		return jobpref;
	}
	public void setJobpref(String jobpref) {
		this.jobpref = jobpref;
	}
	public String getRandomCode() {
		return randomCode;
	}
	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}
	public State getStatusForm() {
		return statusForm;
	}
	public void setStatusForm(State statusForm) {
		this.statusForm = statusForm;
	}
	public int getJobex() {
		return jobex;
	}
	public void setJobex(int jobex) {
		this.jobex = jobex;
	}
	
	public void printAttribute() {
		System.out.println("Applicant Code  : " +randomCode);
		System.out.println("Applicant Name  : " +name);
		System.out.println("Job Experience  : " +jobex);
		System.out.println("Job Preferences : " +jobpref);
		System.out.println("Current Phase   : ");
		statusForm.displayState();
		
		System.out.println();
	}
}
