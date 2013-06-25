package com.anirudh.practice.decorator;

public abstract class FlavourDecorator extends Beverage{
	protected Beverage beverage;
	public abstract String getDescription();
}