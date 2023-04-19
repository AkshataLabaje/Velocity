package InterfaceTesting;

public interface Default {
	
	// Default Method of Interface
	// Default is a Keyword not access Specifier
	// Mart Method is by Default public
	
	public default void Mart()  {
		
		System.out.println("Shops");
	}

		public static void XYZ()   {   // Complete Static Method
			
			System.out.println("Static Method of Interface is Running");
		}
		
		public void Show();   // Incomplete Method of Interface
}
