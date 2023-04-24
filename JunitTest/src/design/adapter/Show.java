package design.adapter;

public class Show {
	
	//画面に文字を表示するメソッド
	public void showStr( String str ){
		
		System.out.println( "★" + str + "★" );
		
	}
	
	//入力された数値を表示するメソッド
	public void showNumber( int value ){
		
		System.out.println( "入力された値 = " + value );
	}

}
