package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that reads an unspecified number of integers and finds the one that has the most occurrences. 
	 * The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 3 3 2 0, the number 3 occurred 
	 * most often. If not one but several numbers have the most occurrences, all of them should be reported. For 
	 * example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
	 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise21_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers (Enter 0 to end): ");
		HashMap<Integer, Integer> map = new LinkedHashMap<>();
		int key;
		int max = 0;
		
		//Store entries and find max
		do {
			key = input.nextInt();
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int value = map.get(key);
				value++;
				if (map.get(key) > max) {
					max = map.get(key);
				}
				map.put(key, value);
			}
		} while (key != 0);
		input.close();
		
		//Get all entries into a set
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		System.out.println("Number\tOccurrences");
		
		//Get key and highest value
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == (max + 1)) {
				System.out.print(entry.getKey() + "\t" + entry.getValue());
			}
			System.out.println();
		}
	}
}