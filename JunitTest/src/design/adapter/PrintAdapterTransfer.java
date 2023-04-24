package design.adapter;


//委譲によるアダプター
public class PrintAdapterTransfer implements Print{
	
	
	Show show;
	
	public PrintAdapterTransfer() {
		super();
		show = new Show();
	}

	@Override
	public void printStr( String str ){
		
		//Showクラスを継承しているため、そのクラスのメソッドを呼び出せる。
		System.out.println( "============================" );
		show.showStr( str );
		System.out.println( "============================" );
	}

	@Override
	public void printNumber( int value ) {

		System.out.println( "----------------------------" );
		show.showNumber( value );
		System.out.println( "----------------------------" );
	}
	
	
	
	//継承よりも記述が増えるが、複数のクラスを継承しなければ対応できない場合は、こちらの委譲での対応が必要となる。

}
