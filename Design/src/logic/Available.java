package logic;

import java.util.List;

import dao.SurviceDao;
import service.Service;


//日付を元に有効なサービスを返すクラス
public class Available {
	
	public static List<Service> getAvailable( String date ){
		
		//ServiceDaoのインスタンス化
		SurviceDao surviceDao = new SurviceDao();
		
		//本日の日付で有効なサービスを取得して返す。
		return surviceDao.select( date );
		
	}
}
