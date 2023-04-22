package design.abstractfactory.factory;

public abstract class OsFactory {
	
	
	//Factoryクラスの生成用メソッド
	@SuppressWarnings("deprecation")
	public static OsFactory getFactory( String className ) {
		
		OsFactory factory = null;
		
		try {
			
			//引数の完全装飾クラス名に応じてインスタンスを生成する。
			factory = (OsFactory)Class.forName( className ).newInstance();
			
		}catch( ClassNotFoundException e ) {
			System.out.println( className + "が見つかりません。" );
			
		}catch( Exception e ) {
			e.printStackTrace();
		}
		
		return factory;
	}
	
	
	//FileSystem生成用のメソッド
	public abstract OsFileSystem createFileSystem();
	
	//DisplaySystem生成用のメソッド
	public abstract OsDisplaySystem createDisplaySystem();

}
