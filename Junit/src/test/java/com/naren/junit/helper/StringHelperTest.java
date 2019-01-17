package com.naren.junit.helper;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	static StringHelper sh;

	@BeforeClass
	public static void runOnceBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
		sh = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", sh.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
		assertEquals("CD", sh.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeSenario() {
		System.out.println("Printing the value: "+sh.areFirstAndLastTwoCharactersTheSame("ABDB"));
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame("ABDB"));
	}

}
