package Inheritance;

public class Child1 extends Child {
	
		public void Cycle()  {
			
		System.out.println("Cycle");
		}
		
			public static void main(String[] args) {
				
				Child1 x = new Child1();
				
				x.Car();
				x.Home();
				x.Money();
				x.Bike();
				x.Cycle();
			}
		}


