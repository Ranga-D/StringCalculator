package com.string.calc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.string.calc.main.StringCalculator;

class StringCalculatorTest {
	// Task-1
	// For example "" or "1" or "1,2" as inputs. (for an empty string it will return
	// 0)
	// Writing first test case to return 0 for empty string
	@Test
	void testingEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	void testingNumberOne() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	void testingNumbertwo() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	//Task-2
	//To check if the method can handle more numbers(Allow the Add method to handle an unknown amount of numbers)
	@Test
	void testingMoreNumber() {
		assertEquals(79, StringCalculator.add("1,2,56,2,1,7,6,4"));
	}
	
	//Task-3
	//to check is the add method handles extra line(Allow the Add method to handle new lines between numbers (instead of commas))
	@Test
	void testingAddingNUmberWithNewLine() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	//Task-4
	//To check is the add method handle to the value("//;\n1;2")
	@Test
	void testingAddingNUmberWithNewLine1() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
	
}
