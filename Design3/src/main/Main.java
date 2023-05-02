package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.BattleCharacterDao;
import entity.BattleCharacter;
import service.Battle;
import service.BattleResult;

public class Main {

	public static void main( String[] args ) {
		
		//本来はユーザーの入力値に応じてキャラクターを生成する。
		List<String> typeList = new ArrayList<>();
		typeList.add( "playable" );
		typeList.add( "enemy" );
		typeList.add( "enemy" );
		
		
		//キャラクターの生成
		Map<Integer,BattleCharacter> battleCharacterMap = BattleCharacterDao.select( typeList );
		
		//戦闘開始
		boolean isVictory = Battle.battle( battleCharacterMap );
		
		//勝利結果を出力
		BattleResult.result( isVictory );
		
	}
}