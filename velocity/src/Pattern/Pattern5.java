package Pattern;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		char a = 'A';
		int space = 4;
		
		for (int i = 0; i <= 4; i++)  {
			
			for (int j = 0; j <= i; j++)   {
				
				System.out.print(" "+a);
			}
				System.out.println();
				space++;
				a++;
			}
		}
		
	}

