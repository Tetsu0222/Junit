package design.abstractfactory.windows;

import design.abstractfactory.factory.OsDisplaySystem;

public class WindowsDisplaySystem extends OsDisplaySystem{
	
	@Override
	public void displayOsName() {
		
		System.out.println( "Windows" );
	}

	@Override
	public void displayStr( String str ) {
		
		System.out.println( str );
	}
}
