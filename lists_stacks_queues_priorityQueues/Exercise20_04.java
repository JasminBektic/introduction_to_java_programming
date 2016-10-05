package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that meets the following requirements:
	 * ■ Define a class named Point with two data fields x and y to represent a point’s x- and y-coordinates. Implement the Comparable interface 
	 * 	 for comparing the points on x-coordinates. If two points have the same x-coordinates, compare their y-coordinates.
	 * ■ Define a class named CompareY that implements Comparator<Point>. Implement the compare method to compare two points on their y-coordinates. 
	 *   If two points have the same y-coordinates, compare their x-coordinates.
	 * ■ Randomly create 100 points and apply the Arrays.sort method to display the points in increasing order of their x-coordinates and in increasing 
	 *   order of their y-coordinates, respectively.
	 */

import helpClasses.Point20_04;
import java.util.Arrays;
import java.util.List;

import helpClasses.CompareY20_04;

public class Exercise20_04 {

	public static void main(String[] args) {
		
		//Random points
		Point20_04[] points = new Point20_04[100];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point20_04((Math.random() * 10), (Math.random() * 10));
		}
		
		//Display points in increasing order of x-coordinates
		Arrays.sort(points);
		List<Point20_04> list1 = Arrays.asList(points);
		System.out.println("Increasing order of x-coordinates:");
		System.out.println(list1);
		
		//Display points in increasing order of y-coordinates
		Arrays.sort(points, new CompareY20_04());
		List<Point20_04> list2 = Arrays.asList(points);
		System.out.println("\nIncreasing order of y-coordinates:");
		System.out.println(list2);
	}
}
