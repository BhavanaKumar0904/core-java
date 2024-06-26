package com.bhavana.k.assignment.utilities;
import com.bhavana.k.assignment.employee.*;

public class EmployeeUtilities {
	
	public void Developer(int employeeId, String employeeName, double employeeSalary, String language, int experience) {		
	Developer d1 = new Developer();
	d1.setName(employeeName);
	d1.setEmployeeId(employeeId);
	d1.setSalary(employeeSalary);
	d1.setLanguage(language);
	d1.setExperience(experience);
	System.out.println(d1);
 }
	public void Manager(int employeeId, String employeeName, double employeeSalary,int noOfTeamMaembers, String projectName ) {
		Manager m1 = new Manager();
		m1.setName(employeeName);
		m1.setEmployeeId(employeeId);
		m1.setSalary(employeeSalary);
		m1.setNoOfTeamMembers(noOfTeamMaembers);
		m1.setProjectName(projectName);
		System.out.println(m1);
	}

}

