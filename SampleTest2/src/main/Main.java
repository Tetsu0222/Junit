package main;

public class Main {

	public static void main(String[] args) {
		
		Task task = new Task();
		
		Thread thread = new Thread( task );
		
		thread.start();
		
		for( int i = 0 ; i < 10000 ; i++ ) {
			System.out.println( "Main" + i );
		}
		

	}

}
