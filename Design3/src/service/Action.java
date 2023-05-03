package service;

import java.util.List;
import java.util.Random;

import entity.BattleCharacter;

public class Action {
	
	//引数のcharacterListは、呼び出し元のメソッドで味方と敵で分けたリストが来る。
	public static BattleCharacter action( BattleCharacter battleCharacter , List<BattleCharacter> characterList ) {
		
		Random random = new Random();
		Integer targetNumber = 0;
		BattleCharacter targetCharacter = null;
		
		targetNumber = random.nextInt( characterList.size() );
		targetCharacter = characterList.get( targetNumber );
		targetCharacter = Damage.calculation( targetCharacter , battleCharacter.getAtk() , battleCharacter.getName() );
		
		return targetCharacter;
		
	}
}
