package Casting;

public class TestUpCasting {
	
	public static void main(String[] args) {
		
		System.out.println("***********Super Class Methods************");
		
		UpCasting x = new UpCasting();
		x.Demo();
		x.Set();
		x.StaticCast();
		
		System.out.println("************Sub Class Methods**************");
		
		UpCast1 y = new UpCast1();
		y.Demo();
		y.Set();
		y.SubClass();
		y.StaticCast();
		
		System.out.println("*************Casting Methods****************");
		
		UpCasting z = new UpCast1();
		
		// { Super Class Ref Variable = new Sub Class }
		
		z.Demo();
		z.Set();
		z.StaticCast();
		
		UpCast1 up = (UpCast1) new UpCasting();
		
		up.Demo();
		up.Set();
		up.StaticCast();
		up.SubClass();
	}

}
