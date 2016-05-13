package com.testcases.comcast.taxperson;
import static org.junit.Assert.*;
import org.junit.Test;
import com.source.comcast.taxperson.Tax;
public class testTaxCalculation {

	@Test
	public void testLuxuryTaxCalculation() {
		Tax item = new Tax();
		double cost = 10.01;
		item.setCost(cost);
		item.setIsLuxury(true);
		double luxuryTaxRate = 1.09;
		double expectedValue = item.roundToPennies(cost * luxuryTaxRate);
		assertTrue(expectedValue == item.calculateFinalCost());
	}

	@Test
	public void testNecessityTaxCalculation(){
		Tax item = new Tax();
		double cost = 21.12;
		item.setCost(cost);
		item.setIsLuxury(false);
		double necessityTaxRate = 1.01;
		double expectedValue = item.roundToPennies(cost * necessityTaxRate);
		assertTrue(expectedValue == item.calculateFinalCost());
		
	}
}
