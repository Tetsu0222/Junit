package design.abstractfactory.linux;

import design.abstractfactory.factory.OsDisplaySystem;

public class LinuxDisplaySystem extends OsDisplaySystem{
	
	@Override
	public void displayOsName() {
		
		System.out.println( "Linux" );
	}

	@Override
	public void displayStr( String str ) {
		
		System.out.println( str );
	}
}
