package com.anirudh.practice.commandPattern;


/**
 * 
 * @author anirudh
 * 
 */
public class RemoteControlBuilder {

	private RemoteControl remoteControl;

	public RemoteControlBuilder(RemoteControl remoteControl) {
		this.remoteControl = remoteControl;
	}

	public void buildRemoteControl() {
		remoteControl.initializeButtons(2);
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		GarageDoorOpenCommand garageOnCommand = new GarageDoorOpenCommand(
				garageDoor);
		GarageDoorCloseCommand garageOffCommand = new GarageDoorCloseCommand(
				garageDoor);

		remoteControl.setSlot(0, lightOnCommand, lightOffCommand);
		remoteControl.setSlot(1, garageOnCommand, garageOffCommand);

	}

}
