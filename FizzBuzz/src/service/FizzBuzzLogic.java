package service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzLogic {
	
	private final int MIN_FIZZ_BUZZ_NUMBER = 1;
	private final int MAX_FIZ_BUZZ_NUMBER = 100;

	public void start( final String[] args ) {
		if( args.length == 0 ) {
			this.argumentEmpty();
		}else{
			this.argumentExistence( args );
		}

	}
	
	public void argumentEmpty() {
		IntStream.rangeClosed( MIN_FIZZ_BUZZ_NUMBER , MAX_FIZ_BUZZ_NUMBER )
			.mapToObj( number -> new FizzBuzzNumber( number ) ).forEach( System.out :: println );
	}
	
	public void argumentExistence( final String[] args ) {
		final List<String> argsList = Arrays.asList( args );
		argsList.stream().map( number -> new FizzBuzzNumber( number ) ).forEach( System.out :: println );
	}
	
}