package main;

import java.util.stream.IntStream;

public class Main {
	public static void main( String[] args ) {
		IntStream.rangeClosed( 1 , 100 ).mapToObj( number -> ( number % 15 == 0 ) ? "FizzBuzz" : ( number % 5 == 0 ) ? "Buzz" : ( number % 3 == 0 ) ? "Fizz" : number ).forEach( System.out :: println );
	}
}