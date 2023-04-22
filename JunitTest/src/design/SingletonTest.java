package design;

public class SingletonTest {

	//自クラスのオブジェクトをフィールドに持つ。private static
	//フィールドの宣言と同時に、自クラスのコンストラクタを呼び出し、クラスの初期化時に1度だけ実行される。
	private static SingletonTest singleton = new SingletonTest();
	
	
	//コンストラクタ privateで修飾することで、他クラスからインスタンス化できないように制限を設けている。
	private SingletonTest() {}
	
	
	//インスタンス取得用のメソッド（このメソッドが呼ばれて初めて初期化される）
	public static SingletonTest getInstance() {
		
		//他クラスで自クラスを使用したい場合は、こちらのメソッドを呼び出す。
		return singleton;
	}
}

/*
 * インスタンスが1つしか存在できないクラスを生成
 * DBとやり取りする同クラスのオブジェクトでデータに衝突が生じないようにする。
 * 
 * Springだと@Beanなどのアノテーションを付与するとSingletonになる。
 * */
