package com.simpleRemote;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(doorOpen);
		remote.buttonWasPressed();
		
		GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(garageDoor);
		remote.setCommand(doorClose);
		remote.buttonWasPressed();
				
	}

}
