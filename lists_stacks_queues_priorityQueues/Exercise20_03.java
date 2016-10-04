package lists_stacks_queues_priorityQueues;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Rewrite Programming Exercise 8.37 to store the pairs of states and capitals so that the questions are displayed 
	 * randomly.
	 */
	
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise20_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list1 = Arrays.asList("Alabama", "Arizona", "Colorado", "Florida", "Kansas");
		List<String> list2 = Arrays.asList("Montgomery", "Phoenix", "Denver", "Tallahassee", "Topeka");
		LinkedList<Object> state = new LinkedList<>(list1);
		LinkedList<Object> capital = new LinkedList<>(list2);
		int positive = 0;
		
		//Shuffle lists with same random object
		while (!state.isEmpty()) {
			Random rand = new Random();
			int seed = rand.nextInt();
			rand.setSeed(seed);
			Collections.shuffle(state, rand);
			rand.setSeed(seed);
			Collections.shuffle(capital, rand);
			
			System.out.printf("What is the capital of %s?", state.getFirst());
			String cap = input.next();
			if (cap.equals(capital.getFirst())) {
				System.out.println("Your answer is correct!");
				positive++;
			} else 
				System.out.printf("The correct answer should be %s.\n", capital.getFirst());
			
			//Remove first element from both lists
			state.removeFirst();
			capital.removeFirst();
		}
		input.close();
		System.out.println("Correct answers: " + positive);
		System.out.println("Incorrect answers: " + (list1.size() - positive));
	}
}
