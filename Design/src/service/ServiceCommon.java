package service;

import java.util.List;

import logic.Available;
import logic.DateCommon;


//サービスを管理するクラス
public class ServiceCommon {
	
	//サービスクラスをリスト化して渡すメソッド
	public List<Service> getService(){
		
		//本日の日付を取得する。
		String today = DateCommon.getToday();
		
		//有効なサービスを取得する。
		List<Service> res = Available.getAvailable( today );
		
		//本日有効なサービスを戻す。
		return res;
		
	}
}
