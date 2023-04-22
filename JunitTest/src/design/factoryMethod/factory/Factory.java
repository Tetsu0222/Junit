package design.factoryMethod.factory;


//工場の抽象クラス
public abstract class Factory {

	
	//Productを生成して登録するメソッド
	//Template Methodパターンを使用することが一般的
	public final Product create( String serialNumber ) {
		
		Product product = createProduct( serialNumber );
		registerProduct( product );
		
		return product;
	}
	
	//Productを生成する抽象メソッド
	protected abstract Product createProduct( String serialNumber );
	
	//Productを登録する抽象メソッド
	protected abstract void registerProduct( Product product );
	
}
