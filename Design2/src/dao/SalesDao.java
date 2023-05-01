package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

//売り上げを管理するクラス
public class SalesDao {
	
	//Daoクラスの建前、本来であればDBから検索した内容をリストへ格納する。
	public List<Item> select(){
		
		List<Item> itemSalesList = new ArrayList<>();
		
		//SQL文が発行されている建前
		itemSalesList.add( new Item( 200 ));
		
		return itemSalesList;
	}
	
}
