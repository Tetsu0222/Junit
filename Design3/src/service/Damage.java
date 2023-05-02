package service;

import entity.BattleCharacter;

public class Damage {
	
	public static BattleCharacter calculation( BattleCharacter targetCharacter , Integer atk , String name ) {
		
		//ダメージ計算
		targetCharacter.setHp( targetCharacter.getHp() - atk );
		
		//ダメージの出力
		System.out.println( name + "は" + targetCharacter.getName() + "に" + atk + "のダメージを与えた!!" );
		
		return targetCharacter;

	}
}
