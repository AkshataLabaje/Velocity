package String;

public class WhiteSpace {      // Duplicate character in given string
	
	public static void main(String[] args) {
		
		String ad = "ABBBBBGFHGHJD A L";
		
	     int total = 0;
	     
	     for (int i = 0; i <= ad.length()-1;i++)   {
	    	
	    	 char s = ad.charAt(i);
	    	// System.out.println(s);
	    	 if(s == 'B')  {
	    		 
	    		 total ++ ;
	    		 
	    	 }
	    	 
	     }
	           System.out.println(total);
	}
	
}
