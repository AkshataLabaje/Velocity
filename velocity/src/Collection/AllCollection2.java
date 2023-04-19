package Collection;

import java.util.HashMap;
import java.util.Map;

public class AllCollection2 {
	
	public static void main(String[] args) {
		
		// Order of the insertion Random
		HashMap<Integer,String> map = new HashMap();
		
		map.put(null, "Automation");
		map.put(87, null);
		map.put(null, "SQL");
		map.put(32, null);
		
		// Advanced for loop
		
		for(Map.Entry<Integer, String> m : map.entrySet())  {
			
			System.out.println("key=" + m.getKey() + "Value" + m.getValue());
		}
		
		System.out.println("*******************");
		map.put(65, "XYZ");
		
		for(Map.Entry<Integer, String> m : map.entrySet())  {
			
			System.out.println("key=" + m.getKey() + "Value" + m.getValue());
		}
	} 

}
