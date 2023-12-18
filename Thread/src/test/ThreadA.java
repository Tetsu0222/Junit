package test;

//Threadクラスを継承する。
public class ThreadA extends Thread{
	
	//run()メソッドをオーバライド
	@Override
	public void run() { //戻り値はないため、処理を行った結果を返せない。
		//スレッドが実行する処理を記述する。
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.println( "A" + i);
		}
	}
}