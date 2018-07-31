
public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		remote.setCommand(garageDoorUp);
		remote.buttonWasPressed();
		
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		remote.setCommand(garageDoorDown);
		remote.buttonWasPressed();
				
	}

}
