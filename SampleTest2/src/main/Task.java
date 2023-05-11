package main;

public class Task implements Runnable{
	
	public void run() {
		for( int i = 0 ; i < 10000 ; i++ ) {
			System.out.println( "Task" + i );
		}
	}

}
