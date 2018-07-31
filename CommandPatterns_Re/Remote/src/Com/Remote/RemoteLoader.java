package Com.Remote;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kichenLight = new Light("KichenLight");
		remoteControl.onCommands[0] = new LightOnCommand(livingRoomLight);
		remoteControl.offCommands[0] = new LightOffCommand(livingRoomLight);
		
		remoteControl.onCommands[1] = new LightOnCommand(kichenLight);
		remoteControl.offCommands[1] = new LightOffCommand(kichenLight);
		
		remoteControl.onCommands[0].execute();
		remoteControl.offCommands[0].execute();
		remoteControl.onCommands[1].execute();
		remoteControl.offCommands[1].execute();
		

	}

}
