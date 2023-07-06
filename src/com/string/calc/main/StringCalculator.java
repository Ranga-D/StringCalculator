package com.string.calc.main;

public class StringCalculator {
	static int output_value=0;
	public static int add(String string) {
		
		if(string.equals("")) {
			return 0;
		}
		else {
			return sum(string);
		}
	}

	private static int sum(String string) {
		output_value=Integer.parseInt(string);
		return output_value;
	}
}
