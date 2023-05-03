package service;

import java.util.List;

import entity.BattleCharacter;

public class TurnAfter {
	
	public static List<BattleCharacter> execution( List<BattleCharacter> characterList ) {
		
		characterList = characterList.stream()
				.filter( character -> character.getHp() > 0 )
				.toList();
		
		return characterList;
		
	}
}