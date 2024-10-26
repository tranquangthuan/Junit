package com.thuan.java.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void testAddition() {
		System.out.println("Running testAddition...");
		Assertions.assertEquals(400, Calculator.add(200, 200));
	}

	@Test
	void testSubtraction() {
		System.out.println("Running testSubtraction...");
		Assertions.assertEquals(100, Calculator.subtract(300, 200));
	}
}
