package com.character;

import com.weapon.*;

public class King extends Character {

	public King(){
		weapon = new AxeBehavior();
	}
	
	public void fight() {
		weapon.useWeapon();
	}

}
