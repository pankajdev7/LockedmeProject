package org.Pankaj;

public class FulltimeEmployee extends Employee {
	private int salary;
	public FulltimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public FulltimeEmployee(int eno, String name, String address, String designation, String qualification, int salary) {
		super(eno, name, address, designation, qualification);
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
