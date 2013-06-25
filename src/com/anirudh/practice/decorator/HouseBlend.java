package com.anirudh.practice.decorator;

public class HouseBlend extends Beverage{
	
	public HouseBlend(){
		setDescription("HouseBlend");
	}

	@Override
	public double calculateCost() {
		return 25;
	}

}
