package velocitypractice;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean stdPass = true;	// conditional DT only TRUE or FALSE output
		
		byte stdmxMarks = 100;		// values from -128 to 127 
		
		short totalMarks = 400;		// value from -32768 to 32767
		
		int rollNumber = 29196;		//greater than Short DT range
		
		long mobileNumber = 7083804545L; // L is mandatory when we use long 
		
		double stdAvgMarks = 420.5558794632158962920;	// fractional up to 15 digit
		
		float stdPercentage = 80.80f;	// f is mandatory
		
		char stdGread ='A';
		
		System.out.println(stdPass);
		System.out.println(stdmxMarks);
		System.out.println(totalMarks);
		System.out.println(rollNumber);
		System.out.println(mobileNumber);
		System.out.println(stdAvgMarks);
		System.out.println(stdPercentage);
		System.out.println(stdGread);
	}

}
