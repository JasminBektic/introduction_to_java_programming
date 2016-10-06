package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Define MyPriorityQueue class that extends PriorityQueue to implement the Cloneable interface and implement the 
	 * clone() method to clone a priority queue.
	 */

import java.util.Collections;

import helpClasses.MyPriorityQueue20_12;

public class Exercise20_12 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Creating queues
		MyPriorityQueue20_12 mpq1 = new MyPriorityQueue20_12();
		MyPriorityQueue20_12 mpq2 = new MyPriorityQueue20_12();
		Collections.addAll(mpq1, "this", "is", "clone", "test");
		
		//Print clone result
		System.out.println("Before cloning\n---------------");
		System.out.println("Object1: " + mpq1);
		System.out.println("Object2: " + mpq2);
		mpq2 = mpq1.clone();
		System.out.println("\nAfter cloning\n--------------");
		System.out.println("Object1: " + mpq1);
		System.out.println("Object2: " + mpq2);
	}
}
