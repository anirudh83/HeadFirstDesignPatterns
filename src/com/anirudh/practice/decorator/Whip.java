package com.anirudh.practice.decorator;

public class Whip extends FlavourDecorator{
	
	public Whip(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+":Whip";
	}

	@Override
	public double calculateCost() {
		return beverage.calculateCost()+7;
	}

}
