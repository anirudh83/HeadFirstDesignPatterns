package com.anirudh.practice.decorator;

/**
 * 
 * @author anirudh
 *
 */
public abstract class Beverage {

	private String description="Beverage";

	public abstract double calculateCost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
