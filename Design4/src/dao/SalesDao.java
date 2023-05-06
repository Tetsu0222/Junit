package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

//売上管理クラス
public class SalesDao {
	
	//条件に応じて売上商品の情報を渡す（仮実装)
	public List<Item> select(){
		
		List<Item> itemList = new ArrayList<>();
		itemList.add( new Item( 200 , "sales" ) );
		itemList.add( new Item( 500 , "sales" ) );
		
		return itemList;
		
	}
}