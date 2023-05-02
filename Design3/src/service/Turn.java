package service;

import java.util.List;

import entity.BattleCharacter;

public class Turn {

	public static boolean execution( List<BattleCharacter> characterList , List<Integer> turnList ) {
		
		//プレイアブルキャラクターの残数を算出
		Long remnantPlayable = characterList.stream()
				.filter( character -> character.getType().equals( "playable" ) )
				.count();
		
		//エネミーキャラクターの残数を算出
		Long remnantEnemy = characterList.stream()
				.filter( character -> character.getType().equals( "enemy" ) )
				.count();
		
		//味方か敵が全滅するまで繰り返す。
		while( remnantPlayable != 0 && remnantEnemy != 0 ) {
			
		}
		
		//戦闘終了後の結果を取得
		//ループを抜けた時、敵が全滅していなければ、味方が全滅していることになる。
		boolean isVictory = remnantEnemy == 0 ? true : false;
		
		//戦闘結果を返す。 Battleクラスを経由してMainクラスまで返す。
		return isVictory;
		
	}
}
