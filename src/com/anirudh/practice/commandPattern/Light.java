package com.anirudh.practice.commandPattern;

/**
 * 
 * @author anirudh
 *
 */
public class Light {

	private LightStatus status;
	
	public void on(){
		status=LightStatus.ON;
		System.out.println("Light is turned on");
	}
	
	public void off(){
		if(status==LightStatus.ON){
			status=LightStatus.OFF;
		}
		System.out.println("Light is turned off");
	}
}
