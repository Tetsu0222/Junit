package main;

public class Test1 {
	
	public static void test1() {
		
		for( int i = 1 ; i <= 100 ; i++ ) {
			
			String number = i % 3 == 0 && i % 5 == 0 ? i + "はfizzbuzz" : i % 3 == 0 ? i + "はfizz" : i % 5 == 0 ? i + "はbuzz" : i + "は違う数値";
					
			System.out.println( number );
		}
	}

}
