package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
	
		public static void main(String[] args) {
		// Object to callarraylist class
		ArrayList r = new ArrayList();
			
		// If we want to store exclusively only String value in ArrayList
		ArrayList<String> a = new ArrayList<String>();
		
		// To add value in array we use "Add" Method values will be stored w.r.t. to index starting from
		a.add("Automation");   // values at zero index
		a.add("Testing");      // values on one index and so on
		a.add("Selenium");
		
		// To remove any value on array we have remove method
		//a.remove(2);
		
		// To extract values we use "get" Method
		a.get(0);
		System.out.println(a.get(0));
		
		// for loop for itration of arraylist
		// for itration we compare i with arraylist size and in array we compare with array length
		
		for (int i = 0; i < a.size(); i++)  {
		System.out.println(a.get(i));
		}
		System.out.println("*****************");
		// Enhanced for loop to print arraylist
		for(String s : a);    {
		 System.out.println(a);
		}
		
		// To check whether certain values is present in an Arraylist
		// we have "contains" method 
		a.contains("Selenium");
		System.out.println(a.contains("Selenium"));
		
		// To correct Array to Arraylist
		
		String [] arr = { "Akshata" , "Reel" , "Real" , "Automatin" };
		
		Arrays.asList(arr);
		// We store it in variable
		List<String> newarr =Arrays.asList(arr);
		// now we can use arraylist methods
		newarr.contains("Selenium");
		System.out.println(newarr.contains("Real"));
		
		}
}
