package Collection;

public class ABC1 <G> {
	
	int a;
	G b;
	
	public static void main(String[] args) {
		
		ABC <Integer> x = new ABC <Integer>();
		x.a = 78;
		
		x.b = 67;
		System.out.println(x.b);
		
		ABC <String> y = new ABC <String>();
		
		y.b = "Automation";
		System.out.println(y.b);
	}

}
