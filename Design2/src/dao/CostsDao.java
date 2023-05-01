package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

//原価管理クラス
public class CostsDao {
	
	//売り上げた商品の原価を戻す。
	public List<Item> select(){
		List<Item> itemCostsList = new ArrayList<>();
		
		itemCostsList.add( new Item( 100 ));
		
		return itemCostsList;
	}

}
