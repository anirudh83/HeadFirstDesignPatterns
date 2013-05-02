package com.anirudh.practice.commandPattern;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.anirudh.practice.commandPattern.RemoteControl;
import com.anirudh.practice.commandPattern.RemoteControlBuilder;

public class RemoteControlTest {
	
	private RemoteControl remoteControl;
	
	@Before
	public void initRemoteControl(){
		remoteControl = new RemoteControl();
		RemoteControlBuilder builder = new RemoteControlBuilder(remoteControl);
		builder.buildRemoteControl();
	}

	@Test
	public void testLightOnCommand() {
		remoteControl.pushOnButton(0);
		assertNotNull(remoteControl);
	}

	@Test
	public void testGarageDoorOpenCommand(){
		remoteControl.pushOnButton(1);
	}
	
	@Test
	public void testGarageClose(){
		remoteControl.pushOffButton(1);
	}
	
	@Test
	public void testLightOnAgain(){
		remoteControl.pushOnButton(0);
	}
	
	@Test
	public void testLightOff(){
		remoteControl.pushOffButton(0);
	}
	
	
}
