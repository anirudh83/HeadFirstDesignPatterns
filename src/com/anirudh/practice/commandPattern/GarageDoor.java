package com.anirudh.practice.commandPattern;

/**
 * 
 * @author anirudh
 * 
 */
public class GarageDoor {

	private DoorStatus doorStatus;

	public void open() {
		if (doorStatus != DoorStatus.OPEN) {
			doorStatus = DoorStatus.OPEN;
		}
		System.out.println("Door is open");
	}

	public void close() {
		if (doorStatus != DoorStatus.CLOSED) {
			doorStatus = DoorStatus.CLOSED;
		}
		System.out.println("Door is closed");
	}

}
