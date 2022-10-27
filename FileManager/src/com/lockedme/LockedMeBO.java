package com.lockedme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

public class LockedMeBO {
	public void displayFilesInAscendingOrder(String directoryPath) { // 
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			sort(files,files.length); // Calling the method sort for shorting files in Ascending order
			for (File fileEntry : files) {
				if (fileEntry.isFile())
					System.out.println(fileEntry.getName());
				else if(fileEntry.isDirectory())
					displayFilesInAscendingOrder(fileEntry.getAbsolutePath()); // call the method for showing the files inside the directory
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void sort(File[] files, int n) { // sort method for sorting the files in ascending order
		int x,j,swaps;
		File temp;
		for(x=n-2;x>=0;x--)
		{
			swaps=0;
			for(j=0;j<=x;j++)
			{
				if(files[j].getName().compareTo(files[j+1].getName())>0)
				{
					temp=files[j];
					files[j]=files[j+1];
					files[j+1]=temp;
					swaps++;
				}
			}
			if(swaps==0)
				break;
		}
	}

	public void addFile(String fileName, String directoryPath) {
		try {
			File directory = new File(directoryPath);
			if (directory.isDirectory()) {
				File f = new File(directoryPath + "/" + fileName);
				if (!f.exists()) {
					f.createNewFile();
				}
				else
				{
					System.out.println("File already existed");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFile(String fileName, String directoryPath) {
		boolean isDeleted=false;
		boolean isExisted=false;
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			for (File fileEntry : files) {
				if(fileEntry.getName().equals(fileName)) {
					isExisted=true;
					if(fileEntry.delete())
						isDeleted=true;
				}
			}
			if(isExisted && isDeleted)
				System.out.println("File deleted Successfully");
			else
				System.out.println("File not found");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchFile(String fileName, String directoryPath) {
		boolean isExisted=false;
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			for (File fileEntry : files) {
				if (fileEntry.isFile()) {
					if(fileEntry.getName().equals(fileName))
						isExisted=true;
					}
			}
			if(isExisted)
				System.out.println("File is existed");
			else
				System.out.println("File is not existed in the directory");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
