package dao;

import java.util.ArrayList;
import java.util.List;

import service.Service;

//DBからサービス内容を取得するクラスを想定
public class SurviceDao {
	
	public List<Service> select( String date ){
		
		List<Service> res = new ArrayList<>();
		
		//本来は、引数を条件としたSQL分を生成し、懸隔結果をリストに格納して返す。
		res.add( new Service( "カット" , 3000 ));
		res.add( new Service( "パーマ" , 8000 ));
		res.add( new Service( "トリートメント" , 4000 ));
		res.add( new Service( "カラー" , 2000 ));
		
		return res;
		
	}

}
