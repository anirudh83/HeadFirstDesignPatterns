package com.anirudh.practice.strategy;

/**
 * 
 * @author anirudh
 *
 */
public abstract class Duck {
	
	private FlyBehaviour flyBehaviour;
	
	public abstract String display();
	
	public void fly(){
		flyBehaviour.fly();
	}
	
	public abstract void swim();

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
}
