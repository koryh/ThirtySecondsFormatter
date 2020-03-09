package main;

public class ThirtySecondsFormatter {
	
	public static String convertToString (double input) {
		// the integer part of the input
		int intInput = (int) input; 
		String stringInput = Integer.toString(intInput);
		// add a 0 at front of the integer part of the input when it is only one digit
		if (stringInput.length()==1) {
			stringInput = '0'+stringInput;
		}
		
		// the decimal part of the input
		double decimalInput = input - intInput;
		// the fraction part of the output
		int frac = (int) (32 * decimalInput);
		
		return stringInput + "-" + String.format("%02d", frac);

	}
	

	
}
