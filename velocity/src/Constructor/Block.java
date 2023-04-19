package Constructor;

public class Block {        // Non Static Block
	{
		System.out.println("Non-Static Block is Running");
	}
		public static void main(String[] args) {
			
			System.out.println("Main Method Running");
			Block x = new Block();
		}
		 	// Static Block
		static   {
					
			System.out.println("Static Block s Running");
		}
	}


