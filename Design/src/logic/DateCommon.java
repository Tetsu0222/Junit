package logic;


import java.text.SimpleDateFormat;
import java.util.Date;

//日付を管理するクラス
public class DateCommon {
	
	public static String getToday() {
		return new SimpleDateFormat( "yyyy/MM/dd" ).format( new Date() );
	}

}
