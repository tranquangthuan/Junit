package com.thuan.java.Junit;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DivisorTest {
	@Tag("POSITIVE")
	@Test
	void testFindDivisorsOf1() {
		System.out.println("Running testFindDivisorsPositive...");

		// Kiểm tra ước của 1 (phải là [1])
		List<Integer> expected = List.of(1);
		Assertions.assertIterableEquals(expected, Divisor.findDivisors(1));
	}

	@Tag("POSITIVE")
	@Test
	void testFindDivisorsOf2() {
		System.out.println("Running testFindDivisorsPositive...");

		// Kiểm tra ước của 2 (phải là [1, 2])
		List<Integer> expected = List.of(1, 2);
		Assertions.assertIterableEquals(expected, Divisor.findDivisors(2));
	}

	@Tag("POSITIVE")
	@Test
	void testFindDivisorsOf6() {
		System.out.println("Running testFindDivisorsPositive...");

		// Kiểm tra ước của 6 (phải là [1, 2, 3, 6])
		List<Integer> expected = List.of(1, 2, 3, 6);
		Assertions.assertIterableEquals(expected, Divisor.findDivisors(6), "Ước của 6 phải là [1, 2, 3, 6]");
	}

	@Tag("NEGATIVE")
	@Test
	void testFindDivisorsOf0() {
		System.out.println("Running testFindDivisorsNegative...");
		Assertions.assertThrows(IllegalArgumentException.class, () -> Divisor.findDivisors(0),
				"Số 0 phải ném ra IllegalArgumentException");
	}

	@Tag("NEGATIVE")
	@Test
	void testFindDivisorsNegativeOf5() {
		System.out.println("Running testFindDivisorsNegative...");
		Assertions.assertThrows(IllegalArgumentException.class, () -> Divisor.findDivisors(-5),
				"Số âm phải ném ra IllegalArgumentException");
	}
}
