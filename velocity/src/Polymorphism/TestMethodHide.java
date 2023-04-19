package Polymorphism;

public class TestMethodHide extends MethodHide {
	
	public static void Demo()   {
		
		System.out.println("Sub Class Demo Method is Running");
	}

			public static void main(String[] args) {
				
				TestMethodHide x = new TestMethodHide();
				x.Demo();
			}
}
