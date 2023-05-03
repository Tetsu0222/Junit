package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entity.BattleCharacter;

public class Turn {
	
	Map<Integer,BattleCharacter> battleCharacterMap;
	int remnantPlayable;
	int remnantEnemy;
	
	public Turn( Map<Integer,BattleCharacter> battleCharacterMap ) {
		this.battleCharacterMap = battleCharacterMap;
	}

	public boolean execution() {
		
		do {
			List<BattleCharacter> characterList = new ArrayList<>( battleCharacterMap.values() );
			TurnProcess turnProcess = new TurnProcess( battleCharacterMap , characterList );
			battleCharacterMap = turnProcess.execution();
			this.remnantPlayable = turnProcess.getRemnantPlayable();
			this.remnantEnemy = turnProcess.getRemnantEnemy();
		
		//味方か敵が全滅するまで繰り返す。
		}while( remnantPlayable != 0 && remnantEnemy != 0 ) ;
		
		//戦闘終了後の結果を取得
		//ループを抜けた時、敵が全滅していなければ、味方が全滅していることになる。
		boolean isVictory = remnantEnemy == 0 ? false : true;
		
		//戦闘結果を返す。 Battleクラスを経由してMainクラスまで返す。
		return isVictory;
		
	}
}
