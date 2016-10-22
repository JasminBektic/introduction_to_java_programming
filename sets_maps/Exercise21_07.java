package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Rewrite Listing 21.9 to display the words in ascending order of occurrence counts. (Hint: Create a 
	 * class named WordOccurrence that implements the Comparable interface. The class contains two fields, 
	 * word and count. The compareTo method compares the counts. For each pair in the hash set in Listing 21.9, 
	 * create an instance of WordOccurrence and store it in an array list. Sort the array list using the 
	 * Collections.sort method. What would be wrong if you stored the instances of WordOccurrence in a tree set?)
	 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import helpClasses.WordOccurrence21_07;

public class Exercise21_07 {

	public static void main(String[] args) {
		String text = "Good morning. Have a good class. Have a good visit. Have fun!";
		
		// Create a HashMap to hold words as key and count as value
		Map<String, Integer> map = new HashMap<>();
		String[] words = text.split("\\.|!| ");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					map.put(key, map.get(key) + 1);
				}
			}
		}	
		// Get all entries into a set
		 ArrayList<WordOccurrence21_07> list = new ArrayList<>();
		 
		// Store key and value in a list
		for (Map.Entry<String, Integer> entry: map.entrySet()) {
			list.add(new WordOccurrence21_07(entry.getKey(), entry.getValue()));
		}
		//Sort list and print result
		Collections.sort(list);
		for (Object o : list) {
			System.out.println(o);
		}
	}
}