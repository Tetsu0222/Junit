package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entity.BattleCharacter;

public class TurnProcess {
	
	Map<Integer,BattleCharacter> battleCharacterMap;
	List<BattleCharacter> characterList;
	List<Integer> turnList;
	private int remnantPlayable;
	private int remnantEnemy;
	
	public TurnProcess( Map<Integer,BattleCharacter> battleCharacterMap , List<BattleCharacter> characterList ) {
		this.battleCharacterMap = battleCharacterMap;
		this.characterList = characterList;
	}
	
	public Map<Integer,BattleCharacter> execution() {
		
		BattleCharacter targetCharacter = null;
		
		//順番を生成（素早さではなくキャラクターの生成順で暫定処理)
		List<Integer> turnList = new ArrayList<>( battleCharacterMap.keySet() );
		
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
			
			//行動対象者が死亡している場合は、ターンをスキップする。
			if( battleCharacter.getHp() <= 0 ) {
				continue;
			}
			
			//味方か敵の行動を判別
			switch( battleCharacter.getType() ){
			
				case "playable":
					targetCharacter = Action.action( battleCharacter , enemyCharacter );
					break;
					
				case "enemy" :
					targetCharacter = Action.action( battleCharacter , playableCharacter );
					break;
			}
			
			//攻撃対象の生存判定及び戦闘不能処理
			Survival.isSurvival( targetCharacter );
			
			//行動結果をマップへ格納
			battleCharacterMap.put( targetCharacter.getKey() , targetCharacter );
		}
		
		//戦闘後の処理
		playableCharacter = TurnAfter.execution( playableCharacter );
		enemyCharacter = TurnAfter.execution( enemyCharacter );
		
		this.remnantPlayable = playableCharacter.size();
		this.remnantEnemy = enemyCharacter.size();
		
		
		return battleCharacterMap;
	}

	
	//getter
	public int getRemnantPlayable() {
		return remnantPlayable;
	}

	public int getRemnantEnemy() {
		return remnantEnemy;
	}
	
	
}
