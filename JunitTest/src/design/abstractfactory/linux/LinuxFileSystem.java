package design.abstractfactory.linux;

import design.abstractfactory.factory.OsFileSystem;

public class LinuxFileSystem extends OsFileSystem{

	@Override
	public String getFileSeparator() {

		return "/";
	}

	@Override
	public String getRootPath() {

		return "/";
	}

	@Override
	public void saveFile( String fileName ) {
		
		String directory = getRootPath() + "user" + getFileSeparator() + fileName;
		System.out.println( directory );
	}

}
