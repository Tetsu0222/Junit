package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entity.BattleCharacter;

public class Battle {
	
	
	public static boolean battle( Map<Integer,BattleCharacter> battleCharacterMap ) {
		
		//キャラクターのリストを生成
		List<BattleCharacter> characterList = new ArrayList<>( battleCharacterMap.values() );
		
		//順番を生成（素早さではなくキャラクターの生成順で暫定処理)
		List<Integer> turnList = new ArrayList<>( battleCharacterMap.keySet() );
		
		//ターン処理を委譲
		boolean isVictory = Turn.execution( characterList, turnList );

		//戦闘結果を返す。
		return isVictory;
		
	}
}