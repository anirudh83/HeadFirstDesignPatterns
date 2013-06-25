package com.anirudh.practice.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeverageMakerTest {
	
	private Beverage beverage;
	private BeverageMaker beverageMaker;

	@Test
	public void testOnlyDecaf() {
		beverageMaker= new BeverageMaker();
		beverage = beverageMaker.getDecaf();
		System.out.println(beverage.getDescription()+" : "+beverage.calculateCost());
	}

	
	@Test
	public void testHouseBlendWithMocha() {
		beverageMaker= new BeverageMaker();
		beverage = beverageMaker.getHouseBlendWithMocha();
		System.out.println(beverage.getDescription()+" : "+beverage.calculateCost());
	}
	
	
	@Test
	public void testDecafWithWhip() {
		beverageMaker= new BeverageMaker();
		beverage = beverageMaker.getDecafWithWhip();
		System.out.println(beverage.getDescription()+" : "+beverage.calculateCost());
	}
}
