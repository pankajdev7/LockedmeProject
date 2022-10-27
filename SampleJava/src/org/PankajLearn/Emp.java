package org.PankajLearn;

public class Emp implements Comparable<Emp> {
	private int eno;
	private String name;
	private String address;
	public Emp() {
		
	}
	
	public Emp(int eno, String name, String address) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
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

	@Override
	public int hashCode() {
		return eno;
		
	}

	@Override
	public String toString() {
		return eno+"\t"+name+"\t"+address;
	}

	@Override
	public int compareTo(Emp e) {
		if(eno<e.getEno())
			return -1;
		else if(eno>e.getEno())
			return 1;
		else
			return 0;
			
	}
	
	
	
}
