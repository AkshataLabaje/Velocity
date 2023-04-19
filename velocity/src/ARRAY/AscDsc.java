package ARRAY;

import java.util.Arrays;

public class AscDsc {
	
	public static void main(String[] args) {
		
		int a [] = { 10, 35, 20, 60, 56, 48 };   // Declaration of Array
		
		 //int Size = a.length-1;
		 //System.out.println(Size);
		
		System.out.println("**********All Info in Array*************");
		
		for(int i = 0; i <=  a.length-1; i++)  {
			System.out.println(a[i]);
			
		}
		
			Arrays.sort(a);
		 System.out.println("************All Info in Array Ascending************");
			
			for(int i = 0; i <= a.length-1; i++)   {
				System.out.println(a[i]);
				
		System.out.println("************All Info in Array Descending************");
				
		System.out.println(" ");
				}
				
		}
	}

	

