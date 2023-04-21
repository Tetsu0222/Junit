package sampletest;

public class Calculator {
	
	
	public static int damage( int a , int b ) {
		
		int hp = 0;
		int def = 10;
		
		b -= def;
		
		if( b > 0) {
			
			if( a > b ){
				hp = a - b ;
			}
			
		}else{
			hp = a;
		}
		
		return hp;
	}

}
