package org.pankajlearn;

import java.io.DataInputStream;
import java.io.IOException;

public class SampleDemo 

{
public static void main(String args[]) throws IOException {	
	String str=null;
	DataInputStream dis= new DataInputStream(System.in);
	System.out.println("enter the name");
	str=dis.readLine();
	
	System.out.println(str);
}
}
