package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that prompts the user to enter a text file name and displays the number of 
	 * vowels and consonants in the file. Use a set to store the vowels A, E, I, O, and U.
	 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise21_04 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter filename:");
		String fileName = input.next();
		input.close();
		File file = new File("d:\\" + fileName);
		
		//Check file existence
		if (!file.exists()) {
			System.out.println("Usage: filename.txt");
			System.exit(0);
		}
		//Store vowels in a set
		Set<String> set = new HashSet<>(Arrays.asList("A", "E", "I", "U", "O"));
		int consonants = 0;
		int vowels = 0;
		
		//Read from file and count vowels and consonants
		try (Scanner in = new Scanner(file)) {
			while (in.hasNextLine()) {
				String s = in.nextLine();
				for (int i = 0; i < s.length(); i++) {
					if (Character.isLetter(s.charAt(i))) {
						String ch = s.charAt(i) + "";
						if (set.contains(ch.toUpperCase())) {
							vowels++;
						} else {
							consonants++;
						}
					}
				}
			}
		}
		//Print result
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}