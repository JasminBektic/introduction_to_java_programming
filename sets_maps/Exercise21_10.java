package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Rewrite Listing 21.7 CountKeywords. java to read in a Java source code file and count the occurrence 
	 * of each keyword in the file, but don’t count the keyword if it is in a comment or in a string literal.
	 */

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise21_10 {
	static Scanner scanner;
	
	public static void main(String[] args) {
		File file = new File("d:\\" + args[0]);
		
		//Check input
		if (args.length != 1) {
			throw new InvalidParameterException("Usage: java Exercise21_10 filename.txt");
		}
		String[] keywordString = {"abstract", "assert", "boolean",
				"break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "enum",
				"extends", "for", "final", "finally", "float", "goto",
				"if", "implements", "import", "instanceof", "int",
				"interface", "long", "native", "new", "package", "private",
				"protected", "public", "return", "short", "static",
				"strictfp", "super", "switch", "synchronized", "this",
				"throw", "throws", "transient", "try", "void", "volatile",
				"while", "true", "false", "null"};
		
		//Scan file and add elements to a string
		String strFile = "";
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				String s = scanner.next();
				if (s.startsWith("//")) {
					scanner.nextLine();
					continue;
				} else if (checkQuotation(s) == true) {
					removeQuotation(s);
					continue;
				} else {
					strFile += s + " ";
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		//Store elements in a map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		String[] words = strFile.split("[\\s.,:;(){}]+");
		for (String s : words) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}
		//Read entries from map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (Arrays.asList(keywordString).contains(entry.getKey())) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
			}
		}
	}
	
	/** Method checking if string has quotations */
	private static boolean checkQuotation(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '"') {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
	
	/** Method reads another file element if there is quotation in previous one */
	private static void removeQuotation(String s) {
		while (checkQuotation(s) == false) {
			s = scanner.next();
		}
	}
}