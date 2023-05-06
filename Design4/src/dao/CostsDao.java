package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

//原価管理クラス
public class CostsDao {
	
	//検索条件に応じて、商品の原価を返す。(仮実装)
	 public List<Item> select(){
		
		 List<Item> itemList = new ArrayList<>();
		 itemList.add( new Item( 100 , "costs" ));
		 itemList.add( new Item( 250 , "costs" ));
		 
		 return itemList;
	}
}