package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Rewrite Listing 12.18, WebCrawler.java, to improve the performance by using appropriate new data 
	 * structures for listOfPendingURLs and listofTraversedURLs.
	 */

import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise21_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		input.close();
		crawler(url); 		// Traverse the Web from the a starting url
	}
	
	public static void crawler(String startingURL) {
		TreeSet<String> hsOfPendingURLs = new TreeSet<>();
		HashSet<String> hsOfTraversedURLs = new HashSet<>();

		hsOfPendingURLs.add(startingURL);
		while (!hsOfPendingURLs.isEmpty() && hsOfTraversedURLs.size() <= 100) {
			String urlString = hsOfPendingURLs.pollFirst();
			if (!hsOfTraversedURLs.contains(urlString)) {
				hsOfTraversedURLs.add(urlString);
				System.out.println("Craw " + urlString);
	
				for (String s: getSubURLs(urlString)) {
					if (!hsOfTraversedURLs.contains(s))
						hsOfPendingURLs.add(s);
				}
			}
		}
	}
	
	public static HashSet<String> getSubURLs(String urlString) {
		HashSet<String> hs = new HashSet<>();
		
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) { 	// Ensure that a correct URL is found
						hs.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					}
					else
						current = -1;
				}
			}
			input.close();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return hs;
	}
}