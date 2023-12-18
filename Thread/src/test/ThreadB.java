package test;

public class ThreadB extends Thread{
	
	public void run() {
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.println( "B" + i);
		}
	}

}
