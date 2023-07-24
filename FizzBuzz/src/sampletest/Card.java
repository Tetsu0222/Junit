package sampletest;

enum Card {
	
	SPADES( 0 ),
	CLUBS( 1 ),
	DIAMONDS( 2 ),
	HEARTS( 3 );
	
	private final int id;
	
	Card( final int id ){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
}