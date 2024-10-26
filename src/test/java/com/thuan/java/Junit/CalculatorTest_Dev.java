package com.thuan.java.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("DEV")
public class CalculatorTest_Dev {

	@Test
	@Tag("FAST")
	void testAddition() {
		System.out.println("Running testAddition...");
		Assertions.assertEquals(4, Calculator.add(2, 2));
	}

	@Test
	@Tag("SLOW")
	void testSubtraction() {
		System.out.println("Running testSubtraction...");
		Assertions.assertEquals(1, Calculator.subtract(3, 2));
	}
}
