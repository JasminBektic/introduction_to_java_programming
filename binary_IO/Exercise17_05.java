package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that stores an array of the five int values 1, 2, 3, 4, and 5, a Date object for the current time, 
	 * and the double value 5.5 into the file named Exercise17_05.dat.
	 */

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Exercise17_05 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//Store objects in a file
		File file = new File("d:\\Exercise17_05.dat");
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		int[] num = {1, 2, 3, 4, 5};
		out.writeObject(num);
		out.writeObject(new Date());
		out.writeObject(5.5);
		out.close();
		
		//Read stored objects
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		int[] newNum = (int[])(in.readObject());
		for (int i = 0; i < newNum.length; i++) {
			System.out.print(newNum[i] + " ");
		}
		Date date = (Date)(in.readObject());
		Double newDouble = (double)(in.readObject());
		System.out.println(date + " " + newDouble);
		in.close();
	}
}
