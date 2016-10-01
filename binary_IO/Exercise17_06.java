package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * The Loan class in Listing 10.2 does not implement Serializable. Rewrite the Loan class to implement Serializable. Write a program 
	 * that creates five Loan objects and stores them in a file named Exercise17_06.dat.
	 */

import java.io.*;
import helpClasses.Loan17_06;

public class Exercise17_06 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("d:\\Exercise17_06.dat");
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		out.writeObject(new Loan17_06(6.5, 5, 1000.5));
		out.writeObject(new Loan17_06(4.5, 4, 3050.12));
		out.writeObject(new Loan17_06(6.5, 5, 5020.2));
		out.writeObject(new Loan17_06(3.5, 3, 2130.7));
		out.writeObject(new Loan17_06(7.5, 5, 1070.2));
		out.close();
	}
}
