package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Suppose a file is encrypted using the scheme in Programming Exercise 17.14. Write a program to decode an encrypted 
	 * file. Your program should prompt the user to enter an input file name for the encrypted file and an output file 
	 * name for the unencrypted version of the input file.
	 */

import java.util.Scanner;
import java.io.*;

public class Exercise17_15 {

	public static void main(String[] args) throws IOException {
		
		//Collecting information
		Scanner input = new Scanner(System.in);
		System.out.println("Enter encrypted file name:");
		String original = input.next();
		System.out.println("Enter desired decrypted file name:");
		String encrypt = input.next();
		input.close();
		
		//Creating input and output stream for files
		FileInputStream file1 = new FileInputStream("d:\\" + original);
		BufferedInputStream in = new BufferedInputStream(file1);
		FileOutputStream file2 = new FileOutputStream("d:\\" + encrypt);
		BufferedOutputStream out = new BufferedOutputStream(file2);
		
		//Subtract 5 from every byte
		int num;
       		while ((num = in.read()) != -1) {
        		out.write(num - 5);
        	}
        	System.out.println("Decryption done!");
		in.close();
		out.close();
	}
}
