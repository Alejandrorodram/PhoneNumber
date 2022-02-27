package phoneNumber;

import java.util.stream.IntStream;

//	Write a function that accepts an array of 10 integers (between 0 and 9), 
//	that returns a string of those numbers in the form of a phone number.	

public class PhoneNumber {
	
	public static void main(String[] args) {
		System.out.println(createPhoneNumber1(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		System.out.println(createPhoneNumber2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		System.out.println(createPhoneNumber3(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		System.out.println(createPhoneNumber4(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}

	public static String createPhoneNumber1(int[] numbers) {		
		return "(" + numbers[0] + numbers[1] + numbers[2] + ")" + " " + numbers[3] + numbers[4] + numbers[5] + "-"
				+ numbers[6] + numbers[7] + numbers[8] + numbers[9];		
	}
	
	public static String createPhoneNumber2(int[] numbers) {		
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
				,numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5]
				,numbers[6],numbers[7],numbers[8],numbers[9]);
	}
	
	public static String createPhoneNumber3(int[] numbers) {		
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
				, IntStream.of(numbers).boxed().toArray());
	}
	
	public static String createPhoneNumber4(int[] numbers) {	
		String phoneNumber = new String("(xxx) xxx-xxxx");
	    
	    for (int i : numbers) {
	      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
	    }
	    
	    return phoneNumber;
	}	
}
