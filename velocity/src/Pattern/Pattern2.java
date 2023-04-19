package Pattern;
public class Pattern2 {
	
	public static void main(String[] args) {
		
		char a = 'A';
		int space = 4;
		
		for (int i = 0; i <= 5; i++)  {
			
			for (int k = 1; k <= space; k++)   {
				System.out.print(" ");
			}	
				for(char j = a; j <= 'A'; j++)  {
				System.out.print(""+a);
			}
				System.out.println();
				space--;
				a--;
			}
		}
	}


