package main;

import test.ThreadA;
import test.ThreadB;
import test2.ThreadC;

public class Main {

	public static void main(String[] args) {

		//Thread継承したクラスをインスタンス化
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		//Runnableを実装したクラスをインスタンス化
		ThreadC c = new ThreadC();
		
		//Runnableのrun()は関数型インターフェースのため、ラムダ式で定義
		new Thread( () -> {
			for( int i = 0 ; i < 5 ; i++ ) {
				System.out.println( "D" + i );
			}
		}).start();

		//run()ではなくstart()で呼び出す。
		a.start();
		b.start();
		
		//run()で呼び出す。
		c.run();
		
	}
}