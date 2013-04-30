package com.anirudh.practice;

public class LightOnCommand implements Command{
	
	private Light light;
	
	
	@Override
	public void execute() {
		light.on();
		
	}

}
