package ConditionalStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "G";
		
		switch (value)  {
		
		case "A" :
			System.out.println("Today is Monday");
		break;
		
		case "B" :
			System.out.println("Today is Tuesday");
		break;
		
		case "C" :
			System.out.println("Today is wednesday");
		break;
		
		case "D" :
			System.out.println("Today is Thuresday");
		break;
		
		case "E" :
			System.out.println("Today is Firday");
		break;
		
		case "F" :
			System.out.println("Today is Saturday");
		break;
		
		case "G" :
			System.out.println("Today is Sunday");
		break;
		
		default:
			
			System.out.println("Default case will be Executed");
		}

	}

}
