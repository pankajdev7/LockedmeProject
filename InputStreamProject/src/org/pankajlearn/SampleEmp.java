package org.pankajlearn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class SampleEmp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("./resources/seri.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		Emp e= new Emp(1, "Pnakj", "bhopal");
		Emp e1= new Emp(2, "Madhu", "indore");
		oos.writeObject(e);
		oos.writeObject(e1);
		System.out.println("serialization completed");
		System.out.println("deserialization started");
		FileInputStream fis=new FileInputStream("./resources/seri.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e3=(Emp) ois.readObject();
		Emp e4=(Emp) ois.readObject();
		System.out.println(e3.getEno()+"\t"+e3.getName()+"\t"+e3.getAddress());
		System.out.println(e4.getEno()+"\t"+e4.getName()+"\t"+e4.getAddress());
		System.out.println("deserialization completed");
	}

}
