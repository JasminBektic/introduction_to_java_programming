package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Encode the file by adding 5 to every byte in the file. Write a program that prompts the user to enter 
	 * an input file name and an output file name and saves the encrypted version of the input file to the 
	 * output file.
	 */

import java.util.Scanner;
import java.io.*;

public class Exercise17_14 {

	public static void main(String[] args) throws IOException {
		
		//Collecting information
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name:");
		String original = input.next();
		System.out.println("Enter desired encrypted file name:");
		String encrypt = input.next();
		input.close();
		
		//Creating input and output stream for files
		FileInputStream file1 = new FileInputStream("d:\\" + original);
		BufferedInputStream in = new BufferedInputStream(file1);
		FileOutputStream file2 = new FileOutputStream("d:\\" + encrypt);
		BufferedOutputStream out = new BufferedOutputStream(file2);
		
		//Add 5 to every byte
		int num;
      		while ((num = in.read()) != -1) {
           		out.write(num + 5);
       		}
       		System.out.println("Encryption done!!");
		in.close();
		out.close();
	}
}
