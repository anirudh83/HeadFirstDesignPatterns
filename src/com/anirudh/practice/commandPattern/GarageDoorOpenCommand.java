package com.anirudh.practice.commandPattern;


/**
 * 
 * @author anirudh
 *
 */
public class GarageDoorOpenCommand implements Command{
	
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor=garageDoor;
		
	}
	@Override
	public void execute() {
		garageDoor.open();
		
	}

	
}
