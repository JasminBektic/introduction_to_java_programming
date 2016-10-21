package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Revise the program in Listing 21.7. If a keyword is in a comment or in a string, don’t count it. 
	 * Pass the Java file name from the command line. Assume that the Java source code is correct and line 
	 * comments and paragraph comments do not overlap.
	 */

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise21_03 {

	
	/** THIS EXERCISE IS NOT FINISHED */
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//Check input and file existence
		if (args.length != 1) {
			throw new InvalidParameterException("Usage: java Exercise21_03 filename.java");
		}
		File file = new File("d:\\" + args[0]);
		if (!file.exists()) {
			throw new FileNotFoundException("File not found");
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
		
		HashSet<String> hs = new LinkedHashSet<>(Arrays.asList(keywordString));
		Scanner input = new Scanner(file);
		String s;
		int count = 0;
		while (input.hasNext()) {
			s = input.next();
			if (s.startsWith("//")) {
				input.nextLine();
			} else if (s.startsWith("\"")) {
				if (!(s.endsWith("\""))) {
					while (input.hasNext()) {
						s = input.next();
						if (s.equals(s.endsWith("\""))) {
							break;
						}
					}
				}
			} else {
				if (hs.contains(s)) {
					count++;
					System.out.println(s);
				}
			}
		}
		input.close();
		System.out.println("The number of keywords in " + file + " is " + count);
	}
}