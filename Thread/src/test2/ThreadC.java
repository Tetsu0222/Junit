package test2;

//Runnableの実装
public class ThreadC implements Runnable{

	//run()メソッドをオーバライド
	@Override
	public void run() {
		//スレッドの処理を記述
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.println( "C" + i );
		}
		
	}
}