package entity;

public class Item {
	
	//価格
	private long price;
	
	//コンストラクタ
	public Item( long price ) {
		this.price = price;
	}

	//getter
	public long getPrice() {
		return price;
	}
	
}