package com.anirudh.practice.decorator;

/**
 * This Mocha flavour decorator adds Mocha to description
 * and also adds the additional cost.
 */
public class Mocha extends FlavourDecorator{
	
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+":Mocha";
		
	}

	@Override
	public double calculateCost() {
		return beverage.calculateCost()+10;
	}

}
