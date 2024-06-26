package com.bhavana.k.assignment.employee;

public class Developer extends Employee {

	private String language;
	private int experience;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + ", experience=" + experience + ", getEmployeeId()=" + getEmployeeId()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	
}
