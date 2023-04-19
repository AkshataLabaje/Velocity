package InterfaceTesting;

public class Set implements Test {
	
	public void Define()  {    // Complete Method Or Implemented Method 
		
		System.out.println("Methods Define is Running");
		
	}
		public void Setup() {
			System.out.println("Method Setup is Running");
			
		}
			public static void main(String[] args) {
				
				Set x = new Set();  // Object of Implementation class
				x.Setup();
				x.Define();
			}
}


