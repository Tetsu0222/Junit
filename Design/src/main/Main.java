package main;

import java.util.List;

import logic.Summary;
import service.Service;
import service.ServiceCommon;

public class Main {

	public static void main( String[] args ) {
		
		//サービスを管理するクラスをインスタンス化
		ServiceCommon serviceCommon = new ServiceCommon();
		
		//本日有効なサービスを取得する。
		List<Service> serviceList = serviceCommon.getService();
		
		//本日有効なサービスを表示する。
		Summary.summary( serviceList );
	}
}