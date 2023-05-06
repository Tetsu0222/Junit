package main;

import java.util.List;

import dao.CostsDao;
import dao.SalesDao;
import entity.Item;
import service.Print;
import service.Statistics;

public class Main {

	public static void main(String[] args) {
		
		//売上管理クラスをインスタンス化
		SalesDao salesDao = new SalesDao();
		
		//売上を取得する。
		List<Item> salesItemList = salesDao.select();
		
		//売上合計を取得（実装変更）
		long clcSales = Statistics.sum( salesItemList );
		
		
		//原価管理クラスをインスタンス化
		CostsDao costsDao = new CostsDao();
		
		//原価を取得する。
		List<Item> costsItemList = costsDao.select();
		
		//原価合計を取得
		long clcCosts = Statistics.sum( costsItemList );
		
		
		//各種合計を出力
		Print.print( clcSales , clcCosts );
		
		//利益を計算
		long profit = Statistics.profit( clcSales, clcCosts );
		
		//利益を出力
		Print.print( profit );
		
		//利益情報を格納
		
	}

}
