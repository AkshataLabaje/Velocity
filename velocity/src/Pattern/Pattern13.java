package Pattern;

public class Pattern13 {
	
	public static void main(String[] args) {
		
		char a = 'E';
		int space = 4;
		
		for(int i = 1; i <= 5; i++ )  {
			
			for(int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
				for (char j = a; j <= 'E'; j++)  {
					System.out.print(" "+a);
				}
					System.out.println();
					space--;
					a--;
			}
		}
	}


