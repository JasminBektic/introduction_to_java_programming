package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Suppose a file named Exercise17_07.dat has been created using the ObjectOutputStream. The file contains Loan objects. 
	 * The Loan class in Listing 10.2 does not implement Serializable. Rewrite the Loan class to implement Serializable. Write 
	 * a program that reads the Loan objects from the file and displays the total loan amount. Suppose you don’t know how many 
	 * Loan objects are there in the file, use EOFException to end the loop.
	 */

import java.io.*;

public class Exercise17_07 {

	public static void main(String[] args) {
		
		//Restoring objects created in last exercise file
		File file = new File("d:\\Exercise17_06.dat");
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
			while (true) {
				System.out.println(in.readObject());
			}
		} catch (EOFException e) {
			System.out.println("All data were read!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
