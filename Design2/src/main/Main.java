package main;

import java.util.List;

import dao.CostsDao;
import dao.SalesDao;
import entity.Item;
import service.Print;
import service.Statisics;

public class Main {

	public static void main(String[] args) {
		
		//売上管理クラスをインスタンス化
		SalesDao salesDao = new SalesDao();
		
		//売り上げを取得する。
		List<Item> itemSalesList = salesDao.select();
		
		//売り上げの合計を取得
		String sales = Statisics.sumSales( itemSalesList );
		
		
		//原価管理クラスをインスタンス化
		CostsDao costsDao = new CostsDao();
		
		//原価を取得する。
		List<Item> itemCostsList = costsDao.select();
		
		//原価合計を取得
		String cost = Statisics.sumSales( itemCostsList );
		
		
		//それぞれの合計を出力
		Print.print( sales , cost );
		
	}

}
