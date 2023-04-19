package LogicalPrograms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int orig = 153;   // 1 + 125 + 27 = 153
		int add = 0;
		
		for (int i = orig; i > 0; i = i/10)  {
			
			int remainder = 1 %	 10;   // 3
			
			add =  add + (remainder * remainder * remainder);
		//	System.out.println(add);
			
		}
			if (orig == add)  {
				System.out.println("Given Number is Armstrong Number");
			}
			else  {
				System.out.println("Given Number is Not Armstrong Number");
		}
	}

}
