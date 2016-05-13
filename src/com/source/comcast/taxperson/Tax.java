package com.source.comcast.taxperson;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tax {
	private static final double LUXURYTAXRATE = 1.09;
	private static final double NECESSITIESTAXRATE = 1.01;
	private double cost;
	private Boolean isLuxury;
	
	
	
	public Tax(double cost, Boolean isLuxury) {
		super();
		this.cost = cost;
		this.isLuxury = isLuxury;
	}
	public Tax() {
		cost = 0;
		isLuxury = false;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Boolean getIsLuxury() {
		return isLuxury;
	}
	public void setIsLuxury(Boolean isLuxury) {
		this.isLuxury = isLuxury;
	}
	public static double getLuxurytaxrate() {
		return LUXURYTAXRATE;
	}
	public static double getNecessitiestaxrate() {
		return NECESSITIESTAXRATE;
	}
	
	public double calculateFinalCost() {

		if (this.isLuxury) {
			if (this.cost * LUXURYTAXRATE >= Double.MAX_VALUE) {
				return Double.MAX_VALUE;
			}
			return this.roundToPennies((this.cost * LUXURYTAXRATE));
		}
		
		if (this.cost * NECESSITIESTAXRATE >= Double.MAX_VALUE) {
			return Double.MAX_VALUE;
		}
		return this.roundToPennies(this.cost * NECESSITIESTAXRATE);
	}
	
	public double roundToPennies(double input) {

		BigDecimal value = new BigDecimal(input);
		return value.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
	}
	

}
