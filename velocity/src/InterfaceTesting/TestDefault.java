package InterfaceTesting;

public class TestDefault implements Default {
	
	public void Show()  {
		System.out.println("Show Method is Running");
	}
	
	public void Mart()  {
		System.out.println("All Shops");
	}
 
		public static void main(String[] args) {
			
			TestDefault x = new TestDefault();
			
			x.Mart();
		}
}
