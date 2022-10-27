package org.pankajlearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleDemo1 {

	public static void main(String[] args) throws IOException {
		File f =new File("./resources/abc.txt");
		char ch[]= new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		System.out.println("the character are");
		for(char c:ch)
			System.out.println(c);
	}

}
