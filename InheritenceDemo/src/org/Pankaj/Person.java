package org.Pankaj;

public class Person {
	private int pid;
	private String name;
	private String address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String name, String address) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
