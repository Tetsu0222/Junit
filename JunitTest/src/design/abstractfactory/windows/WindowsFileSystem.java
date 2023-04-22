package design.abstractfactory.windows;

import design.abstractfactory.factory.OsFileSystem;


//疑似的なセパレーターなどの取得クラス
public class WindowsFileSystem extends OsFileSystem{

	@Override
	public String getFileSeparator() {

		return "\\";
	}

	@Override
	public String getRootPath() {

		return "C:\\";
	}

	@Override
	public void saveFile( String fileName ) {
		
		String directory = getRootPath() + "work" + getFileSeparator() + fileName;
		System.out.println( directory );
	}

}
