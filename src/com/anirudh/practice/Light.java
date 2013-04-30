package com.anirudh.practice;

/**
 * 
 * @author anirudh
 *
 */
public class Light {

	private LIGHT_STATUS lightStatus;
	
	public void on(){
		lightStatus=LIGHT_STATUS.ON;
		System.out.println("Light is turned on");
	}
	
	public void off(){
		if(lightStatus==LIGHT_STATUS.ON){
			lightStatus=LIGHT_STATUS.OFF;
		}
		System.out.println("Light is turned off");
	}
}
