package Method;

public class BasicMethod4 {   // Calling From Different Class
	
		public static void main(String[] args) {
			BasicMethod2.test();    // Static Method Call From Diffrent Class
			
			BasicMethod2 x = new BasicMethod2();   // Object Creation 
			x.demo();      // Non static Method Call From Different Class
		}

}
