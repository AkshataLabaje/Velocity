package Polymorphism;

public class Riding2 extends Riding1 {      // Overriding
	
	public void statement()   {
		
		System.out.println("Method from Sub Class is Running");
	}

			public static void main(String[] args) {
				
				Riding2 x = new Riding2();
				x.statement();
				
				Riding1 y = new Riding2();
				y.statement();
			}
}
