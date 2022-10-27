package com.lockedme;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		final String ROOT_DIRECTORY_PATH = "F:\\Java_study\\JavaPro";
		String fileName;
		LockedMeBO bo = new LockedMeBO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to LockedMe.com");
		System.out.println();
		System.out.println("Developer Info");
		System.out.println();
		System.out.println("Pankaj Dwivedi-Developer");
		System.out.println();
		int ch, ch1;
		do {
			System.out.println("1. List Files in Ascending order");
			System.out.println("2. Edit File");
			System.out.println("3. Exit");
			System.out.println("Enter the Choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				bo.displayFilesInAscendingOrder(ROOT_DIRECTORY_PATH);
				break;
			case 2:
				do {
					System.out.println("1. Add File to the Directory");
					System.out.println("2. Remove File from Directory");
					System.out.println("3. Searching a File in Direcotry");
					
					System.out.println("4. Enter to Main menu");
					ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						fileName=readFileName(sc);
						bo.addFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 2:
						fileName=readFileName(sc);
						bo.deleteFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 3:
						fileName=readFileName(sc);
						bo.searchFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 4:
						default:
					
					}
				} while (ch1 <=3);
				break;
			}
		} while (ch < 3);

	}

	private static String readFileName(Scanner sc) {
		System.out.println("Enter the File name");
		sc.nextLine();
		String fileName=sc.nextLine();
		return fileName;
	}

}
