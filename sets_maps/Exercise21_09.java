package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Rewrite Programming Exercise 8.37 to store pairs of each state and its capital in a map. 
	 * Your program should prompt the user to enter a state and should display the capital for the state.
	 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise21_09 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Alabama", "Montgomery");
		map.put("Arizona", "Phoenix");
		map.put("Colorado", "Denver");
		map.put("Florida", "Tallahassee");
		map.put("Kansas", "Topeka");
		
		//Iterate trough Hashmap and count correct answers
		Scanner input = new Scanner(System.in);
		int count = 0;
		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.println("What is the capital of " + m.getKey() + "?");
			String answer = input.next();
			if (answer.toLowerCase().equals(m.getValue().toLowerCase())) {
				System.out.println("Your answer is correct");
				count++;
			} else {
				System.out.println("The correct answer should be " + m.getValue());
			}
		}
		input.close();
		System.out.println("The correct count is " + count);
	}
}