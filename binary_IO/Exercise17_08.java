package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Suppose you wish to track how many times a program has been executed. You can store an int to count the file. 
	 * Increase the count by 1 each time this program is executed. Let the program be Exercise17_08 and store the 
	 * count in Exercise17_08.dat.
	 */

import java.io.*;

public class Exercise17_08 {

	public static void main(String[] args) throws IOException {
		int count = 1;
		
		//Read data if file exists
		File file = new File("d:\\Exercise17_08.dat");
		if (file.exists()) {
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			count = in.readInt();
			in.close();
		}
		System.out.println("This program is executed " + count + " times.");
		
		//Increase counter and write it
		DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
		out.writeInt(count + 1);
		out.close();
	}
}
