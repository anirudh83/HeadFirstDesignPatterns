package com.anirudh.practice.decorator;

public class Decaf extends Beverage{
	
	public Decaf(){
		setDescription("Decaf");
	}

	@Override
	public double calculateCost() {
		return 20;
	}
	
	

}
