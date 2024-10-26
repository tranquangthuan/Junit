package com.thuan.java.Junit;

import java.util.ArrayList;
import java.util.List;

public class Divisor {

	private Divisor() {
	}

	public static List<Integer> findDivisors(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n phải là số nguyên dương");
		}
		List<Integer> divisors = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
}
