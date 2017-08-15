package com.character;
import com.weapon.*;

public abstract class Character {
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeaponBehavior(WeaponBehavior wb){
		weapon = wb;
	}
}
