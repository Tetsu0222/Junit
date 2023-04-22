package design.abstractfactory.windows;

import design.abstractfactory.factory.OsDisplaySystem;
import design.abstractfactory.factory.OsFactory;
import design.abstractfactory.factory.OsFileSystem;


//インスタンスを生成して返すメソッドを持つクラス
public class WindowsFactory extends OsFactory{

	@Override
	public OsFileSystem createFileSystem() {
		
		//インスタンス生成前後の処理を入れることができるため、柔軟な拡張性を持たせられる。
		return new WindowsFileSystem();
	}
	

	@Override
	public OsDisplaySystem createDisplaySystem() {

		return new WindowsDisplaySystem();
	}

}
