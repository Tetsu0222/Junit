package design.prototype;

public class ProtoType {
	
	public void main() {
		
		Manager manager = new Manager();
		
		//ポーションの生成
		Potion redPotion = new Potion( "赤色のポーション" );
		manager.register( "redPotion" , redPotion );
		
		Potion orangePotion = new Potion( "オレンジのポーション" );
		manager.register( "orangePotion" , orangePotion );
		
		
		//剣の生成
		Sword copperSword = new Sword( "鋼の剣" );
		manager.register( "copperSword" , copperSword );
		
		
		//クローンの生成
		Item sword1 = manager.create( "copperSword" );
		sword1.get();
		sword1.use();
		
		Item potion1 = manager.create( "redPotion" );
		potion1.get();
		potion1.use();
		
		Item potion2 = manager.create( "orangePotion" );
		potion2.get();
		potion2.use();
		
	}
}


//原型となるオブジェクトをいくつか用いしておき、それらをコピーしてインスタンスを生成するデザインパターン
//newを使ってインスタンスを生成しないため、独立性の高い設計が可能となる。

//RPGのアイテムなどのように、少しだけ振る舞いがことなるインスタンスを多数生成する場合に効果を発揮する。
//参照型のフィールドはコピーされないことに留意
//剣クラスに特殊効果を設定し、その特殊効果を参照するフィールドを同クラスに定義した場合、すべての剣クラスが同じ特殊効果を参照することとなる。
//参照型のフィールドもコピーしたいのであれば、clone()メソッドをオーバライドして独自定義する必要が生じる。
