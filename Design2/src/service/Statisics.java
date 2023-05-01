package service;

import java.util.List;

import entity.Item;


//商品の合計金額を計算するクラス
public class Statisics {
	
	public static String sumSales( List<Item> itemList ) {
		
		long res = 0L;
		for( Item item : itemList ) {
			res += item.getPrice();
		}
		
		return res + "円";
	}
	


}
