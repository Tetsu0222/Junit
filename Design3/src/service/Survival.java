package service;

import entity.BattleCharacter;

public class Survival {
	
	public static boolean isSurvival( BattleCharacter targetCharacter ) {
		
		boolean survival = targetCharacter.getHp() > 0 ? true : false;
		
		if( !survival ) {
			System.out.println( targetCharacter.getName() + "を倒した" );
		}
		
		return survival;
	}
	

}
