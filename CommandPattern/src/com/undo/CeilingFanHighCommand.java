package com.undo;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		this.ceilingFan.high();
	}

	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
	
}
