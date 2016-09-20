package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Write a program to create a file named Exercise17_02.dat if it does not exist. Append new data to it if it already 
	 * exists. Write 100 integers created randomly into the file using binary I/O.
	 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise17_02 {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\Exercise17_02.dat");
		FileOutputStream out = null;
		if (!file.exists()) {
			out = new FileOutputStream(file);	//New file and data input
			dataInput(out);
		} else {
			out = new FileOutputStream(file, true);		//Add data to existing file
			dataInput(out);
		}
			
		//Display data in console
		FileInputStream in = new FileInputStream(file);
		while (in.read() != -1) {
			System.out.println(in.read());
		}
		in.close();
	}
	
	/* Data input into file */
	public static void dataInput(FileOutputStream out) throws IOException {
		for (int i = 0; i < 100; i++) {
			int rand = (int) (Math.random() * 20 + 1);
			out.write(rand);
		}
		out.close();
	}
}
