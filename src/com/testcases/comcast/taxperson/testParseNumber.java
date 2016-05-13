package com.testcases.comcast.taxperson;

import static org.junit.Assert.*;

import org.junit.Test;

import com.source.comcast.taxperson.TaxApp;


public class testParseNumber {

	@Test
	public void testHundredthValueResolution() {
		assertTrue(-1.0 != TaxApp.parseCostInput("120.52"));
	}

	@Test
	public void testTenthValueResolution(){
		assertTrue(-1.0 != TaxApp.parseCostInput("130.1"));
	}
	
	@Test
	public void testIntegerInput(){
		assertTrue(-1.0 != TaxApp.parseCostInput("130"));
	}
	
	@Test
	public void testNegativeInputRejection(){
		assertTrue(-1.0 == TaxApp.parseCostInput("-12.04"));
	}
	
	@Test
	public void testBadInputRejection(){
		assertTrue(-1.0 == TaxApp.parseCostInput("hello"));
	}
	
	@Test
	public void testOutOfRangeValueResolution(){
		assertTrue(-1.0 == TaxApp.parseCostInput("1241.002342"));
	}
}
