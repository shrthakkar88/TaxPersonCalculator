package com.testcases.comcast.taxperson;

import static org.junit.Assert.*;

import org.junit.Test;

import com.source.comcast.taxperson.Tax;

public class testRounding {

	@Test
	public void testRoundingBasic() {

		Tax aItem = new Tax();
		Tax bItem = new Tax();

		assertTrue(aItem.roundToPennies(10.00) == aItem.roundToPennies(10.00));
	}

	@Test
	public void testRoundingBehavior() {
		Tax aItem = new Tax();
		Tax bItem = new Tax();

		assertTrue(aItem.roundToPennies(10.004) != aItem.roundToPennies(10.005));
	}

}
