package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.BattleCharacter;
import entity.EnemyCharacter;
import entity.PlayableCharacter;

public class BattleCharacterDao {
	
	
	public static Map<Integer , BattleCharacter> select( List<String> typeList ) {
		
		Map<Integer , BattleCharacter> battleCharacterMap = new HashMap<>();
		int i = 0;
		
		for( String type : typeList ) {
			BattleCharacter character = null;
			
			switch( type ) {
			
			case "playable":
				character = new PlayableCharacter( "テストプレイヤー" , 100 , 30 );
				character.setKey( i );
				battleCharacterMap.put( i , character );
				i++;
				break;
			
			case "enemy":
				character = new EnemyCharacter( "テストエネミー" , 50 , 10 );
				character.setKey( i );
				battleCharacterMap.put( i , character );
				i++;
				break;
			}
		}
		return battleCharacterMap;
	}

}
