package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println( "メインスレッド実行" );
		
		Thread thread = new Thread( new Runnable() {
			
			public void run() {
				System.out.println( "別スレッドで実行" );
			}
		});
		
		thread.start();
		
		try {
			Thread.sleep( 500 );
			
		}catch( Exception e ) {
			e.printStackTrace();
		}
		
		System.out.println( "メインスレッド終了" );
	}
}