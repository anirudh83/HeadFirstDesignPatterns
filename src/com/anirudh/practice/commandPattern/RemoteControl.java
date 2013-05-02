package com.anirudh.practice.commandPattern;


public class RemoteControl {

	private Command[] onButtons;
	private Command[] offButtons;
	
	public void initializeButtons(int numberOfButtons){
		onButtons = new Command[numberOfButtons];
		offButtons = new Command[numberOfButtons];
	}
	
	public void pushOnButton(int slot){
		onButtons[slot].execute();
	}
	
	public void pushOffButton(int slot){
		offButtons[slot].execute();
	}
	
	public void setSlot(int slot, Command onCommand, Command offCommand){
		onButtons[slot]=onCommand;
		offButtons[slot]=offCommand;
	}
}
