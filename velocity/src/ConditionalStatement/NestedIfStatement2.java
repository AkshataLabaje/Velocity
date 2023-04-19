package ConditionalStatement;

public class NestedIfStatement2 {

	public static void main(String[] args) {               //Nested If
		// TODO Auto-generated method stub
		
			String Username = "AkshataLabaje";
			String Password = "Akshata@20";
			
			if (Username == "AkshataLabaje")
			{
				System.out.println("Correct User Name"); 
				if (Password == "Akshata@20")
					
				{
					System.out.println("Password is Corrrect");
					System.out.println("Login Successful");
				}
				else 
				{
					System.out.println("Password is Incorrect");
					System.out.println("Login Failed");
				}
			}
			else
			{
				System.out.println("Incorrect User Name");
				System.out.println("Login Failed");
			}
		}
	}			
					
		
	


