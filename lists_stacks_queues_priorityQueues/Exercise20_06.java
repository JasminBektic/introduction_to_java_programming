package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a test program that stores 5 million integers in a linked list and test the time to traverse the list 
	 * using an iterator vs. using the get(index) method.
	 */

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Exercise20_06 {

	public static void main(String[] args) {
		
		//Create list with 5 million integers
		LinkedList<Integer> linkList = new LinkedList<>();
		for (int i = 0; i < 5_000_000; i++) {
			linkList.add(i);
		}
		
		//Measuring time using iterator
		long start = System.nanoTime();
		while (!linkList.iterator().hasNext()) {
			linkList.iterator().next();
		}
		long end = System.nanoTime();
		long linkElapsedTime = end - start;
		System.out.println("Elapsed time using iterator: " + TimeUnit.SECONDS.convert(linkElapsedTime, TimeUnit.NANOSECONDS) + " seconds");
		
		//Measuring time using get(index)
		start = System.nanoTime();
		for (int i = 0; i < linkList.size(); i++) {
			linkList.get(i);
		}
		end = System.nanoTime();
		linkElapsedTime = end - start;
		System.out.println("Elapsed time using get(index): " + TimeUnit.SECONDS.convert(linkElapsedTime, TimeUnit.NANOSECONDS) + " seconds");
	}
}
