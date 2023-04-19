package ConditionalStatement;

public class NstedIfStatement {

	public static void main(String[] args) {              // Nested If
		// TODO Auto-generated method stub
		
			String UN = "XYZ";
			String PWD = "a@123";
			
			if (UN =="XYZ")  {
				System.out.println("Correct User Name");
				
				if ( PWD =="a@123")   {
					System.out.println("Password is Correct");
					System.out.println("Login Successful");
				}
				else  {
					
					System.out.println("Password is Incorrect");
					System.out.println("Login Failed");
			
				}
			}
			else {
				
				System.out.println("Incorrect UserName");
				System.out.println("Login Failed");
			
				}
			}

	}


