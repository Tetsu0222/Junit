package sampletest;

import java.util.stream.IntStream;

public class FizzBuzzSample {
	
	int BuzzNumber = 5;
	int FizzNumber = 3;
	
	public void sample() {
		
		IntStream.rangeClosed( 1 , 100 )
		.mapToObj( number -> ( number % (BuzzNumber * FizzNumber) == 0 ) ? number + "はFizzBuzz" : 
				 ( number % BuzzNumber == 0 ) ? number + "はBuzz" : 
				 ( number % FizzNumber == 0 ) ? number + "はFizz" : 
				   String.valueOf(number) )
		.forEach( System.out :: println );
	}
	
	public void sample2() {
		
		for( int i = 1 ; i < 100 ; i++ ) {
			
			String str = String.valueOf(i);
			int count = 0; //「～はBuzz」出力時、切り分けに使用
			
			if( i % BuzzNumber == 0) {
				str +=  "はFizz";
				count++; //FizzBuzzになる際、「はFizzはBuzz」とならないようにする。
			}
			if( i % BuzzNumber == 0) {
				str += count == 0 ? "はBuzz" : "Buzz"; //FizzBuzzかBuzzかの切り分け
			}
			System.out.println(str);
		}
	}
}
