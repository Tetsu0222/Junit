package service;

import java.util.List;
import java.util.Random;

import entity.BattleCharacter;

public class TurnProcess {

	
	public static List<Integer> execution( List<BattleCharacter> characterList , List<Integer> turnList ) {
		
		Random random = new Random();
		Integer targetNumber = 0;
		BattleCharacter targetCharacter = null;
		
		
		//プレイアブルキャラクターだけのリストを生成
		List<BattleCharacter> playableCharacter = characterList.stream()
				.filter( character -> character.getType().equals( "playable" ) )
				.toList();
		
		//エネミーキャラクターだけのリストを生成
		List<BattleCharacter> enemyCharacter = characterList.stream()
				.filter( character -> character.getType().equals( "enemy" ) )
				.toList();
		
		//戦闘処理
		for( Integer turnNumber : turnList ) {
			BattleCharacter battleCharacter = characterList.get( turnNumber );
			
			switch( battleCharacter.getType() ){
				case "playable":
					targetNumber = random.nextInt( enemyCharacter.size() + 1 );
					targetCharacter = enemyCharacter.get( targetNumber );
					targetCharacter = Damage.calculation( targetCharacter , battleCharacter.getAtk() , battleCharacter.getName() );
					break;
					
				case "enemy" :
					targetNumber = random.nextInt( playableCharacter.size() + 1 );
					targetCharacter = playableCharacter.get( targetNumber );
					targetCharacter = Damage.calculation( targetCharacter , battleCharacter.getAtk() , battleCharacter.getName() );
					break;
			}
			
		}
		
		return turnList;
	}
}
