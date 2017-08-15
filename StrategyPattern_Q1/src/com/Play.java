package com;

import com.character.*;
import com.character.Character;
import com.weapon.*;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character queen = new Queen();
		queen.fight();
		queen.setWeaponBehavior(new KnifeBehavoir());
		queen.fight();
		
		Character troll = new Troll();
		troll.fight();
	}

}
