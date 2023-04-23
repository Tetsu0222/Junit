package design.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	//Prototypeの保持用
	private Map<String , Item> itemMap = new HashMap<>();
	
	//Prototypeの登録
	public void register( String name , Item item ) {
		itemMap.put( name , item );
	}
	
	//クローン生成
	public Item create( String itemName ) {
		
		Item item = itemMap.get( itemName );
		
		return item.createClone();
	}
}
