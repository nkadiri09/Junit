package com.naren.junit.helper;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exception1Test {

	@Test(expected = ArithmeticException.class)
	public void testDivisionWithException() {
		int i = 1 / 0;

		// Negative Scenario
		// int i = 1 / 2;
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testEmptyList() {
		new ArrayList<>().get(0);

		// Negative Senario

		/*
		 * String[] a = {"Ramesh", "Reddy", "Kadiri","Narendra"}; List<String> names =
		 * Arrays.asList(a);
		 */
	}

}