package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that reads words from a text file and displays all the words (duplicates allowed) in ascending 
	 * alphabetical order. The words must start with a letter. The text file is passed as a command-line argument.
	 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise20_01 {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\" + args[0]);
		
		//Check input and file existence
		if (args.length != 1) {
			System.out.println("Usage: java Exercise20_01 filename.txt");
			System.exit(0);
		}
		if (!file.exists()) {
			System.out.println("File does not exist!");
			System.exit(0);
		}
		
		//Read data from file and store to List
		List<String> list = new ArrayList<>();
		Scanner read = new Scanner(file);
		while (read.hasNext()) {
			list.add(read.next());
		}
		read.close();
		
		//Sort list and print
		Collections.sort(list);
		for (String s : list) System.out.println(s);
	}
}
