package com.anirudh.practice.decorator;

public class BeverageMaker {
	
	public Beverage getDecaf(){
		return new Decaf();
	}

	public Beverage getDecafWithWhip(){
		return new Whip(new Decaf());
	}
	
	public Beverage getHouseBlendWithMocha(){
		return new Mocha(new HouseBlend());
	}
	
}
