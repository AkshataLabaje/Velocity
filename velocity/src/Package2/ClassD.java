package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {   // Using Inheritance
	
	public static void main(String[] args) {
		
		ClassD x = new ClassD();
		
		System.out.println(x.a);  // Public
		
		System.out.println(x.c); // Protected can be access because of Inheritance
		
		
	}

}
