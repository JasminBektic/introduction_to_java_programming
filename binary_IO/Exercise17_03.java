package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Suppose a binary data file named Exercise17_03.dat has been created and its data are created using writeInt(int) in 
	 * DataOutputStream. The file contains an unspecified number of integers. Write a program to find the sum of the integers.
	 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise17_03 {

	public static void main(String[] args) throws IOException {
		
		//File created for test purpose
		File file = new File("d:\\Exercise17_03.dat");
		DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
		for (int i = 1; i <= 5; i++) {
			out.writeInt(i);
		}
		out.close();
		int sum = 0;
		
		//Read integers from file and sum them
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		while (in.read() != -1) {
			sum += in.read();
		}
		in.close();
		System.out.println("Sum: " + sum);
	}
}
