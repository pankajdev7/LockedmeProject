package org.Pankaj;

public class Employee extends Person {
	private String designation;
	private String qualitfication;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String name, String address, String designation, String qualitfication) {
		super(eno, name, address);
		this.designation = designation;
		this.qualitfication = qualitfication;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQualitfication() {
		return qualitfication;
	}
	public void setQualitfication(String qualitfication) {
		this.qualitfication = qualitfication;
	}
	
}
