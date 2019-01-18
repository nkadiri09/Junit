package com.naren.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void compareSampleArray() {

		int numbers[] = { 15, 1, 9, 8, 0 };
		int expected[] = { 0, 1, 8, 9, 15 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

}
