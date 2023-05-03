package service;

import java.util.Map;

import entity.BattleCharacter;

public class Battle {
	
	
	public static boolean battle( Map<Integer,BattleCharacter> battleCharacterMap ) {
		
		//ターン処理を委譲
		Turn turn = new Turn( battleCharacterMap );
		boolean isVictory = turn.execution();

		//戦闘結果を返す。
		return isVictory;
		
	}
}