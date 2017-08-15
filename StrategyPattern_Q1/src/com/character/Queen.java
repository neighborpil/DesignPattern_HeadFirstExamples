package com.character;
import com.weapon.*;

public class Queen extends Character {

	public Queen(){
		weapon = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		weapon.useWeapon();
	}

}
