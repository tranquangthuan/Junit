package com.thuan.java.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	void testFactorialOf0() {
		Assertions.assertEquals(1, Factorial.factorial(0), "0! phải bằng 1");
	}

	@Test
	void testFactorialOf1() {
		Assertions.assertEquals(1, Factorial.factorial(1));
	}

	@Test
	void testFactorialOf2() {
		Assertions.assertEquals(2, Factorial.factorial(2));
	}

	@Test
	void testFactorialOf5() {
		Assertions.assertEquals(120, Factorial.factorial(5));
	}

	@Test
	void testFactorialNegative() {
		System.out.println("Running testFactorialNegative...");
		Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1),
				"Giai thừa của số âm phải ném ra IllegalArgumentException");
	}
}
