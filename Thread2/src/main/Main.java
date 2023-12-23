package main;

public class Main {

	public static void main(String[] args) {
	
		//ThreadAの処理
		Thread threadA = new Thread( () -> {			
			System.out.println("threadA : Sleep開始");			
			try {
				Thread.sleep(5000);	 //5秒間スリープ		
			}catch( InterruptedException e ) {
				System.out.println("threadA : 割り込みをキャッチしました"); //例外がスローされると同時に、スリープを解除して、処理を再開
			}
			System.out.println("threadA : 処理再開");
		});
		threadA.start();
		
		//mainスレッドの処理
		try {
			System.out.println("main : Sleep開始");
			Thread.sleep(2000); //2秒間スリープ
			System.out.println("main : Sleep終了");
			threadA.interrupt(); //ThreadAで割り込み処理を呼び出し。例外をスロー
		}catch( InterruptedException e ) {
			System.out.println("main : 割り込みをキャッチしました");
		}
	}
}