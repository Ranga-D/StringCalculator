package com.string.calc.main;

public class StringCalculator {
	static int total_value=0;
	static String delimiter=",";
	static String negativeString = "";
	public static int add(String string) {
		
		if(string.equals("")) {
			return 0;
		}
		else {
			if(string.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(string.charAt(2));
				string = string.substring(4);
			}
			String numbers[]=splitTheNumbers(string,delimiter + "|\n");
			return sum(numbers);
		}
	}

	private static String[] splitTheNumbers(String string, String delimiter2) {
		return string.split(delimiter2);
	}
	private static int sum(String[] numbers) {
		for(String number : numbers) {
			if(Integer.parseInt(number) < 0){
        		if(negativeString.equals("")) {
        			negativeString = number;}
        		else {
        			negativeString += ("," + number);}
        	}
			total_value=total_value+Integer.parseInt(number);
		}
		if(!negativeString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
		}
		return total_value;
	}
}