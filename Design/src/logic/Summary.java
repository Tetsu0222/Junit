package logic;

import java.util.List;

import service.Service;

//サービス情報を文字列で出力するクラス
public class Summary {

	//文字列で出力するメソッド
	public static void summary( List<Service> serviceList ) {
		
		for( Service service : serviceList ) {
			System.out.println( service.getName() + " : " + service.getPrice() + "円" );
		}
	}
}
