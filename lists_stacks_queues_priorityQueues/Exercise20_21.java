package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write the following generic method using selection sort and a comparator. public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) 
	 * Write a test program that creates an array of 10 GeometricObjects and invokes this method using the GeometricObjectComparator introduced in 
	 * Listing 20.4 to sort the elements. Display the sorted elements. Use the following statement to create the array.
	 * GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
	 * 		new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
	 * 		new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
	 * 		new Circle(6.5), new Rectangle(4, 5)};
	 */

import java.util.Comparator;
import helpClasses.Circle20_21;
import helpClasses.GeometricObject20_21;
import helpClasses.GeometricObjectComparator20_21;
import helpClasses.Rectangle20_21;

public class Exercise20_21 {

	public static void main(String[] args) {
		
		//List of objects
		GeometricObject20_21[] list = {new Circle20_21(5), new Rectangle20_21(4, 5),
				new Circle20_21(5.5), new Rectangle20_21(2.4, 5), new Circle20_21(0.5),
				new Rectangle20_21(4, 65), new Circle20_21(4.5), new Rectangle20_21(4.4, 1),
				new Circle20_21(6.5), new Rectangle20_21(4, 5)};
		
		//Method call and printing sorted objects
		selectionSort(list, new GeometricObjectComparator20_21());
		System.out.println("Sorted list\n------------");
		for (Object ch : list) {
			System.out.println(ch);
		}
	}
	
	/** Selection sort method */
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		for (int i = list.length - 1; i >= 1; i--) {
			E max = list[0];
			int maxIndex = 0;
			for (int j = 1; j <= i; j++) {
				if (comparator.compare(max, list[j]) < 0) {
					max = list[j];
					maxIndex = j;
				}
			}
			//Swap list[i] with list[maxIndex] if necessary
			if (maxIndex != i) {
				list[maxIndex] = list[i];
				list[i] = max;
			}
		}
	}
}