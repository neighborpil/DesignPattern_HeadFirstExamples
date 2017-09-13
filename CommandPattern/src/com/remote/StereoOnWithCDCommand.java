package com.remote;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolumn(11);
	}

}
