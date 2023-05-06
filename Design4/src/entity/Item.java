package entity;

public class Item {
	
	private long price;
	private String type;
	
	public Item( long price , String type ) {
		this.price = price;
		this.type = type;
	}

	public long getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}
}