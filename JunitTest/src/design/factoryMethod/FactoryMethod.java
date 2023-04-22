package design.factoryMethod;

import design.factoryMethod.factory.Factory;
import design.factoryMethod.factory.Product;
import design.factoryMethod.pc.PcFactory;

public class FactoryMethod {
	
	
	//ファクトリークラスの生成
	Factory factory = new PcFactory();
	
	//製品クラスの生成
	Product pc1 = factory.create( "A01" );
	Product pc2 = factory.create( "B01" );
	Product pc3 = factory.create( "C01" );
	
	//製品クラスの使用
	public void AllUse() {
		pc1.use();
		pc2.use();
		pc3.use();
	}
	
}


//インスタンスの生成をサブクラスへ任せるデザインパターン
//インスタンスの生成が柔軟に実装できるようになる。
//近い感じのものはRPGでの魔法か特技を判別するメソッドで使用していた。
//
