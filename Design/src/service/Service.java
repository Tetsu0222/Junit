package service;

public class Service {
	
	private String name;
	private int price;
	
	
	//コンストラクタ
	public Service( String name , int price ){
		this.name = name;
		this.price = price;
	}

	//getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
}