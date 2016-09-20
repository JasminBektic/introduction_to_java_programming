package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Write a program to create a file named Exercise17_01.txt if it does not exist. Append new data to it if it already exists. 
	 * Write 100 integers created randomly into the file using text I/O. Integers are separated by a space.
	 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Exercise17_01 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("d:\\Exercise17_01.txt");
		PrintWriter out = null;
		if (!file.exists()) {
			out = new PrintWriter(file);
			fileInput(out);
		} else
			out = new PrintWriter(new FileOutputStream(file, true));	//Read file and add data
			out.println();
			fileInput(out);
	}
	
	/* Input data into file */
	public static void fileInput(PrintWriter out) {
		for (int i = 0; i < 100; i++) {
			int rand = (int) (Math.random() * 20 + 1);
			String s = String.valueOf(rand);
			out.print(s + " ");
		} 
		out.close();
	}
}