package org.pankajlearn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		//int ch;
		File f = new File("./resources/abc.txt");
		char ch[]=new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		FileWriter fw= new FileWriter("./resources/xz.txt", true);
		fr.read(ch);
		fw.write(ch);
		fw.write(102);
		fw.flush();// last charcter to the file is also added to the file
		fr.close();
		fw.close();
	}

}
