package sampletest;

import java.util.stream.IntStream;

public class FizzBuzzSample {
	
	
	public void sample() {
		IntStream.rangeClosed( 1 , 100 )
		.mapToObj( number -> ( number % 15 == 0 ) ? "FizzBuzz" : 
				 ( number % 5 == 0 ) ? "Buzz" : 
				 ( number % 3 == 0 ) ? "Fizz" : 
				   String.valueOf(number) )
		.forEach( System.out :: println );
	}
}
