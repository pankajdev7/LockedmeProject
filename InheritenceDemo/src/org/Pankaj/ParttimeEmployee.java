package org.Pankaj;

public class ParttimeEmployee extends Employee {
	private int hourlyWage;
	public ParttimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public ParttimeEmployee(int eno, String name, String address, String designation, String qualification, int hourlyWage) {
		super(eno, name, address, designation, qualification);
		this.hourlyWage = hourlyWage;
	}
	public int getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
}
