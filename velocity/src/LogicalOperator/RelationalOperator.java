package LogicalOperator;

public class RelationalOperator {
	
	   		public static void main(String[] args)  {
	   			
	   			// AND Operator &&
	   			
	   			System.out.println( (10>3) && (12>7) );   // True
	   			System.out.println( (12>4) && (10>8) );    // Manager did some changes
	   			System.out.println( (10>3) && (12<7) );   // True
	   			
	   			// OR Operator ||
	   			
	   			System.out.println( (10>3) || (12<7) );    // True
	   			
	   			System.out.println( (10<3) || (12<7) );     // Flase
	   			
	   			// NOT Operator !
	   			
	   			System.out.println( ! (10 == 7) );        // True
	   			
	   			System.out.println( ! (5>1) );           // Flase
	   		}

}
