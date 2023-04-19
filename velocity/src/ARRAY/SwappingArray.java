package ARRAY;

public class SwappingArray {

			public static void main(String[] args) {
				
				int a[] = { 15, 25, 35, 45, 67, 89 };
				
				for(int i = 0; i <= a.length-1; i++)   {
					System.out.println(a[i]);
					
				}
					// a[0] = a[3] Last Index -0;
				    // a[0] = a[2] Last Index -1;
				
				for(int i = 0; i<(a.length/2); i++)   {
					
					int c ;
					c = a[i];      //  15 c= 15;
					a[i] = a[(a.length-1)-i];
					   // a[3]-0 = a[3] = 45;a[i] = 45
					a[(a.length-1)-i] = c;
					
				}
				
				System.out.println();
		//	     System.out.println(a[0]);
		//		System.out.println(a[3]);
				
				for (int i = 0; i <=a.length-1; i++)   {
					System.out.println(a[i]);
	
	}
			}
}
