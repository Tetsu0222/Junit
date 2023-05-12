package main;

import java.lang.reflect.Field;


//アクセス修飾子を動的に変更する。
public class Main {

	public static void main(String[] args) {
		
		
		try {
			Item item = new Item();
			
			Field f = Item.class.getDeclaredField( "name" );
			
			//アクセス修飾子をpublicへ変更
			f.setAccessible( true );
			
			//nameフィールドからデータを取得する。
			String name = (String)f.get( item );
			
			System.out.println( name );
			
		}catch( Exception e ) {
			e.printStackTrace();
		}

	}

}
