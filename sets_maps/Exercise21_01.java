package sets_maps;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"} 
	 * and find their union, difference, and intersection. (You can clone the sets to preserve the original sets from being changed by these 
	 * set methods.)
	 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise21_01 {

	public static void main(String[] args) {
		HashSet<String> hs1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		HashSet<String> hs2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		
		//Finding union
		HashSet<String> temp1 = new LinkedHashSet<>(hs1);
		HashSet<String> temp2 = new LinkedHashSet<>(hs2);
		temp1.addAll(temp2);
		System.out.println("Union: " + temp1);
		
		//Finding difference
		temp1 = new LinkedHashSet<>(hs1);
		temp2 = new LinkedHashSet<>(hs2);
		temp1.removeAll(hs2);
		temp2.removeAll(hs1);
		temp1.addAll(temp2);
		System.out.println("Difference: " + temp1);
		
		//Finding intersection
		temp1 = new LinkedHashSet<>(hs1);
		temp2 = new LinkedHashSet<>(hs2);
		temp1.retainAll(hs2);
		System.out.println("Intersection: " + temp1);
	}
}