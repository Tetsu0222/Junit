package design.factoryMethod.pc;

import java.util.ArrayList;
import java.util.List;

import design.factoryMethod.factory.Factory;
import design.factoryMethod.factory.Product;


//Pcクラスを生成するクラス
public class PcFactory extends Factory{

	//製造番号を格納するリスト
	private List<String> serialNumberLiat = new ArrayList<>();
	
	@Override
	protected Product createProduct( String serialNumber ) {
		
		//新たなパソコンクラスを生成
		return new Pc( serialNumber );
	}
	
	@Override
	protected void registerProduct( Product product ) {
		
		//製品リストへ新たに製造番号を登録
		serialNumberLiat.add( ( (Pc)product ).getSerialNumber() );
	}
	
}
