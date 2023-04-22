package design.abstractfactory;

import design.abstractfactory.factory.OsDisplaySystem;
import design.abstractfactory.factory.OsFactory;
import design.abstractfactory.factory.OsFileSystem;

public class AbstractFactory {
	
	
	public void Main( Object obj ) {
		
		//引数のオブジェクトから完全修飾されたクラス名を取得
		String className = obj.getClass().getName();
		
		//取得したクラス名に応じたオブジェクトを所得
		OsFactory factory = OsFactory.getFactory( className );
		OsDisplaySystem displaySystem = factory.createDisplaySystem();
		displaySystem.displayOsName();
		displaySystem.displayStr( "サンプル" );
		
		OsFileSystem fileSystem = factory.createFileSystem();
		fileSystem.saveFile( "sample.txt" );
	}
}



//関連したり依存しあうオブジェクト群のインスタンスを生成できる。
//Classクラスにより取得したクラス情報を元に処理を分岐させることによって、拡張性の高いFactoryパターンがデザインできる。

//部品となるクラスが複数存在しており、今後も拡張される可能性が高い時に効果を発揮するデザインパターン
//また、実行環境に追加や変更が生じる場合にも有効

//しかし、部品の大分類を増やす場合、変更の影響が大きくなる可能性がある。
//車であれば、タイヤやエンジンなど、部品の種別自体が増えると、それぞれのサブクラスに変更が及ぶ可能性が生じる。
