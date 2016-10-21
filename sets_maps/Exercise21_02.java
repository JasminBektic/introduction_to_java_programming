package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that reads words from a text file and displays all the nonduplicate words 
	 * in ascending order. The text file is passed as a command-line argument.
	 */

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise21_02 {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\" + args[0]);
		
		//Check input and file existence
		if (args.length != 1) {
			System.out.println("Usage: java Exercise21_02 filename.txt");
			System.exit(0);
		}
		if (!file.exists()) {
			System.out.println("File doesn't exist");
			System.exit(0);
		}
		
		//Reading from file and store elements in HashSet
		HashSet<String> hs = new HashSet<>();
		try (Scanner input = new Scanner(file);){
			while (input.hasNext()) {
				String s = input.next();
				hs.add(s);
			}
		}
		//Order elements and print
		TreeSet<String> ts = new TreeSet<>(hs);
		for (String t : ts) {
			System.out.println(t);
		}
	}
}
