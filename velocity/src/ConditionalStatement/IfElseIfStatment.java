package ConditionalStatement;

public class IfElseIfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int marks = 89;
		
		if (marks >= 75)  {
			System.out.println("Student Pass in Distinction"); 
			
		}
		else if (marks >=60)  {
				
			System.out.println("Student Pass in First Class");
		}
			
		else if (marks >=50)  {
				System.out.println("Student Pass in Second Class");
			}
				
		else if (marks >= 35) {
				System.out.println("Student Pass");
				
		}
			System.out.println("Fail");
		}
	}


