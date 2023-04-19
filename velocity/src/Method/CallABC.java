package Method;

public class CallABC extends ABC {
	
	public void Rest()    {
		System.out.println("Incomlete Method");
	}
		public void Test()   {
			System.out.println("Test Method Reimplemented");
			
		}
			public static void main(String[] args) {
				CallABC x = new CallABC();
				
				x.Rest();
				x.Test();
				
				ABC y = new CallABC();
				y.Test();
				y.Rest();
			}
	}



