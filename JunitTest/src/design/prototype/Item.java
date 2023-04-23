package design.prototype;

public interface Item extends Cloneable{
	
	//アイテムを獲得するメソッド
	public void get();
	
	//アイテムを使用するメソッド
	public void use();
	
	//クローンを生成するメソッド
	public Item createClone();
}
