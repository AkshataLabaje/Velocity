package String;

public class MethodsString {
	
	public static void main(String[] args) {
		
		String s1 = "Velocitysdfghghjk";
		String s2 = "cityvelocity";
		String s3 = "city";
		String s4 = "xyz";
		String s5 = "ABC";
		
	System.out.println(s1.charAt(4));   // To print character at any index
	System.out.println(s2.replace("v", "y"));   // To replace old character to new
	System.out.println(s2.isEmpty());
	System.out.println(s2.concat(s3));   // To Combine Two String
	System.out.println(s2.substring(2));
	System.out.println(s2.substring(4, 6));
	System.out.println(s1.startsWith("ve"));
	System.out.println(s1.endsWith("ty"));
	System.out.println(s1.indexOf("c"));
	System.out.println(s1.lastIndexOf("c"));
	System.out.println(s1.length());
	System.out.println(s1.contains("s3"));
	System.out.println(s2==s3);
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s1.toUpperCase());
	System.out.println(s3.toLowerCase());
     String c = String.join(s2,s1,s3,s4,s5);
     System.out.println(c);
     
     String[]result = s1.split("c");
     for(int i = 0; i < result.length;i++)  {
    	 System.out.println(result[i]);
     }
	
 
	}

}
