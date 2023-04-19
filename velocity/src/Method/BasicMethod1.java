package Method;

public class BasicMethod1 {
	
	static int Demo() {      //  User Define Method Declaration
		
		int x = 78;
		int y = 65;
		int z = x+y;
		return z;
		
	}
		static String test() {    // User Define Method Declaration
			return "Testing";
		}
			public static void main(String[] args) {
				System.out.println("Abcde");
				
				int z = Demo();    // User Define Method int type data
				System.out.println(z);
				
				String a =test();  // User Define Method String type data
				System.out.println(a);
			}
	}


