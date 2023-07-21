package service;

public class FizzBuzzNumber {
	
	private final String FIZZ_BUZZ_NUMBER;
	private final int MIN_FIZZ_BUZZ_NUMBER = 1;
	private final int MAX_FIZ_BUZZ_NUMBER = 100;
	private final int IS_FIZZ_BUZZ_NUMBER = 15;
	private final int IS_BUZZ_NUMBER = 5;
	private final int IS_FIZZ_NUMBER = 3;
	private final String FIZZ_BUZZ = "FizzBuzz" ;
	private final String BUZZ = "Buzz" ;
	private final String FIZZ = "Fizz" ;
	private final String AND_TEXT = "は";
	private final String ERROR_MESSAGE = "不正な値です";
	
	FizzBuzzNumber( final int number ){
		if( number < MIN_FIZZ_BUZZ_NUMBER ) {
			throw new IllegalArgumentException();
		}
		if( number > MAX_FIZ_BUZZ_NUMBER ) {
			throw new IllegalArgumentException();
		}
		final StringBuilder sb = new StringBuilder();
		sb.append( number );
		sb.append( AND_TEXT );
		this.FIZZ_BUZZ_NUMBER = number % IS_FIZZ_BUZZ_NUMBER == 0 ? sb.append( FIZZ_BUZZ ).toString() : 
								number % IS_BUZZ_NUMBER == 0  ? sb.append( BUZZ ).toString() : 
								number % IS_FIZZ_NUMBER == 0  ? sb.append( FIZZ ).toString() : 
								String.valueOf( number );
	}
	
	FizzBuzzNumber( final String number ){
		final int judgement;
		try{
			judgement = Integer.parseInt( number );
		}catch( Exception e ) {
			throw new IllegalArgumentException( ERROR_MESSAGE );
		}
		final StringBuilder sb = new StringBuilder();
		sb.append( number );
		sb.append( AND_TEXT );
		this.FIZZ_BUZZ_NUMBER = judgement % IS_FIZZ_BUZZ_NUMBER == 0 ? sb.append( FIZZ_BUZZ ).toString() : 
								judgement % IS_BUZZ_NUMBER == 0  ? sb.append( BUZZ ).toString() : 
								judgement % IS_FIZZ_NUMBER == 0  ? sb.append( FIZZ ).toString() : 
								number ;
	}
	
	public String toString() {
		return FIZZ_BUZZ_NUMBER;
	}
	
}