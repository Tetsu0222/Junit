package service;


//情報を出力するクラス
public class Print {
	
	
	//売上と原価を出力
	public static void print( long clcSales , long clcCosts ) {
		System.out.println( "売上" + clcSales + "円" );
		System.out.println( "原価" + clcCosts + "円" );
	}
	
	//利益を出力
	public static void print( long profit ) {
		System.out.println( "利益" + profit + "円" );
	}
	
}