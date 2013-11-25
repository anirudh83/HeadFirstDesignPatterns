package com.anirudh.practice.strategy;

public class ADuck extends Duck {
	
	public ADuck(){
		FlyBehaviour flyBehaviour = new FlyWithWings();
		this.setFlyBehaviour(flyBehaviour);
}

	@Override
	public String display() {
		System.out.println("I am ADuck");
		return "ADuck";
		
	}

	@Override
	public void swim() {
       System.out.println("ADuck Swimming");		
	}

}
