package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * A Java program contains various pairs of grouping symbols, such as:
	 * ■ Parentheses: ( and )
	 * ■ Braces: { and }
	 * ■ Brackets: [ and ]
	 * Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal. Write a program to check whether 
	 * a Java source-code file has correct pairs of grouping symbols. Pass the source-code file name as a command-line argument.
	 */

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Exercise20_11 {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\" + args[0]);
		
		//Check input and file existence
		if (args.length != 1) {
			System.out.println("Usage: java Exercise20_11 filename.java");
			System.exit(0);
		}
		if (!file.exists()) {
			System.out.println("File does not exist!");
			System.exit(0);
		}
		//Stream file
		DataInputStream dos = new DataInputStream(new FileInputStream(file));
		
		//Create array of operators and new stack object
		ArrayList<String> operators = new ArrayList<>();
		Collections.addAll(operators, "(", ")", "{", "}", "[", "]");
		Stack<String> stack = new Stack<>();
		String s;
		int index = 0;
		
		//Iterate trough file and set conditions
		while ((s = dos.readLine()) != null) {
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < operators.size(); j++) {
					if ((s.charAt(i) + "").equals(operators.get(j))) {
						index = j;
						if (stack.size() == 0 || index == 0) {
							stack.push(operators.get(index));
							break;
						}
						if (operators.get(index - 1).equals(stack.peek())) {
							stack.pop();
						} else {
							stack.push(operators.get(index));
						}
					}
					
				}
			}
		}
		dos.close();
		String print = (stack.size() == 0) ? "File have correct pairs of grouping symbols." : 
			"File doesnt have correct pairs of grouping symbols.";
		System.out.println(print);
	}
}
