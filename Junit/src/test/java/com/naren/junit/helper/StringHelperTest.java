package com.naren.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		StringHelper sh = new StringHelper();
		assertEquals("CD", sh.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
		StringHelper sh = new StringHelper();
		assertEquals("CD", sh.truncateAInFirst2Positions("ACD"));
	}

}
