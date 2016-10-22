package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Rewrite Listing 21.9 to read the text from a text file. The text file is passed as a 
	 * command-line argument. Words are delimited by whitespace characters, punctuation marks (,;.:?), 
	 * quotation marks ('"), and parentheses. Count words in case-insensitive fashion (e.g., consider 
	 * Good and good to be the same word). The words must start with a letter. Display the output in 
	 * alphabetical order of words, with each word preceded by its occurrence count.
	 */

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise21_08 {

	public static void main(String[] args) {
		File file = new File("d:\\" + args[0]);
		
		//Check input
		if (args.length != 1) {
			throw new InvalidParameterException("Usage: java Exercise21_08 filename.txt");
		}
		
		//Store file elements in a string
		String s = "";
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()) {
				s += scanner.next() + " ";
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		//Split words and store key and value in a map
		Map<String, Integer> map = new TreeMap<>();
		String[] words = s.split("[\\s.,:;()?'\"]+");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}	
		//Print entries
		for (Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}