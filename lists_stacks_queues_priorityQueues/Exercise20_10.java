package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Create two priority queues, {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and 
	 * {"George", "Katie", "Kevin", "Michelle", "Ryan"}, and find their union, difference, and intersection.
	 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Exercise20_10 {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		PriorityQueue<String> q2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		PriorityQueue<String> temp = new PriorityQueue<>();
		
		//Calling methods
		union(q1, q2, temp);
		intersection(q1, q2, temp);
		difference(q1, q2, temp);
	}
	
	/** Method merge two queues */
	private static void union(PriorityQueue<String> q1, PriorityQueue<String> q2, PriorityQueue<String> temp) {
		temp.addAll(q1);
		temp.addAll(q2);
		System.out.println("Union: " + temp);
	}
	
	/** Method finding non common elements */
	private static void difference(PriorityQueue<String> q1, PriorityQueue<String> q2, PriorityQueue<String> temp) {
		PriorityQueue<String> temp2 = new PriorityQueue<>();
		temp.clear();
		temp2.addAll(q1);
		temp.addAll(q2);
		temp.removeAll(q1);
		temp2.removeAll(q2);
		temp.addAll(temp2);
		System.out.println("Non common elements: " + temp);
	}
	
	/** Method finding elements in common */
	private static void intersection(PriorityQueue<String> q1, PriorityQueue<String> q2, PriorityQueue<String> temp) {
		temp.clear();
		temp.addAll(q2);
		temp.retainAll(q1);
		System.out.println("Elements in common: " + temp);
	}
}