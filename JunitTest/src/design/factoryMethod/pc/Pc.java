package design.factoryMethod.pc;

import design.factoryMethod.factory.Product;

//Productクラスを継承したクラス（製品→PC）
public class Pc extends Product {
	
	
	private String serialNumber;
	
	
	public Pc( String serialNumber ) {
		super();
		System.out.println( serialNumber + "のパソコンを製造します。" );
		this.serialNumber = serialNumber;
	}

	
	@Override
	public void use() {
		System.out.println( serialNumber + "のパソコンを使用します。" );
	}
	
	
	public String getSerialNumber() {
		
		return this.serialNumber;
	}
	
}
