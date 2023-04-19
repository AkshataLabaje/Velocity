package ConditionalStatement;

public class ifelsestatement5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int Bill = 5000, Age = 20; String  Gender ="Female";
			
			if ((Age++ > 20) && (Bill > 4000))  {
				System.out.println("Customer is Eligible to Discount");
			}
			else {
				System.out.println("Customer have to Pay Entire Bill");
			}
	//------------------------------------------------------------------------------------
			
			if ((Bill > 3000) || (Gender == "Female") || Age < 10)  {
				System.out.println("She is Prime Customer");
			}
			else  {
				System.out.println("Customer is Normal Customer");
			}
   //--------------------------------------------------------------------------------------
			
			if ((!(Bill >= 5000)) || Gender == "Male")   {
				System.out.println("True");
				{
					System.out.println("False");
				
				}
			}
	}
}
				
			

	


