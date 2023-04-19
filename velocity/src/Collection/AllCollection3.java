package Collection;

import java.util.HashSet;

public class AllCollection3 {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		// Insertion order not maintain or RANDOM
		
	//	HashSet<Character> set = new HashSet<Character>();
		
		set.add("Akshata");
		set.add('%');
		set.add(1234);
		set.add(null);
		
		System.out.println(set);
		
		for(Object f : set) {
			System.out.println(f);
		}
	}

}
