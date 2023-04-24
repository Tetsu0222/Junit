package design.adapter;


//継承によるアダプター
public class PrintAdapter extends Show implements Print{

	@Override
	public void printStr( String str ){
		
		//Showクラスを継承しているため、そのクラスのメソッドを呼び出せる。
		System.out.println( "============================" );
		showStr( str );
		System.out.println( "============================" );
	}

	@Override
	public void printNumber( int value ) {

		System.out.println( "----------------------------" );
		showNumber( value );
		System.out.println( "----------------------------" );
	}

}
