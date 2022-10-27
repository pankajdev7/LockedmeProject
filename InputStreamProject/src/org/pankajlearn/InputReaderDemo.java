package org.pankajlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputReaderDemo {

	public static void main(String[] args) throws IOException {
		String str= null;
		//InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader br= new BufferedReader(isr);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter hte name");
		str=br.readLine();
		System.out.println("the name is"+"\t"+str);
}
}
