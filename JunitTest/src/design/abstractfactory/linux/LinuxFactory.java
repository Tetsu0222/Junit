package design.abstractfactory.linux;

import design.abstractfactory.factory.OsDisplaySystem;
import design.abstractfactory.factory.OsFactory;
import design.abstractfactory.factory.OsFileSystem;

public class LinuxFactory extends OsFactory{

	@Override
	public OsFileSystem createFileSystem() {
		
		//インスタンス生成前後の処理を入れることができるため、柔軟な拡張性を持たせられる。
		return new LinuxFileSystem();
	}
	

	@Override
	public OsDisplaySystem createDisplaySystem() {

		return new LinuxDisplaySystem();
	}

}
