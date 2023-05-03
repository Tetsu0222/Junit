package service;

public class BattleResult {
	
	
	//戦闘結果を出力する。
	public static void result( boolean isVictory ) {
		
		//勝利宣言
		if( isVictory ) {
			System.out.println( "プレイヤーは勝利した" );
			return;
		}
		
		//敗北宣言
		System.out.println( "プレイヤーは敗北した" );
	}
}
