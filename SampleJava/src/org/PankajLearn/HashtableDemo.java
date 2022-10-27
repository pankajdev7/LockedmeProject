package org.PankajLearn;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable h= new Hashtable<>();
		h.put(new temp(5), "A");
		h.put(new temp(2), "B");
		h.put(new temp(6), "C");
		h.put(new temp(15), "D");
		h.put(new temp(23), "E");
		h.put(new temp(16), "F");
		System.out.println(h);
	}

}
class temp {
	
	int i;

	public temp(int i) {
		super();
		this.i = i;
	}
	public int hashCode()
	{
		return i;
		
	}
	public String toString() {
		return i+"";
		
	}
}
