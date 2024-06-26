package com.bhavana.k.assignment.employee;

public class Manager extends Employee {

	private int noOfTeamMembers;
	private String projectName;

	public int getNoOfTeamMembers() {
		return noOfTeamMembers;
	}

	public void setNoOfTeamMembers(int noOfTeamMembers) {
		this.noOfTeamMembers = noOfTeamMembers;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Manager [noOfTeamMembers=" + noOfTeamMembers + ", projectName=" + projectName + ", getEmployeeId()="
				+ getEmployeeId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	
	

}