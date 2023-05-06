package service;

import java.util.List;
import java.util.stream.Collectors;

import entity.Item;


//計算を処理するクラス
public class Statistics {
	
	
	//売上と原価の合計を計算する。
	public static long sum( List<Item> items ) {
		
		return items.stream()
				.map( item -> item.getPrice() )
				.collect( Collectors.summingLong( price -> price ));
	}
	
	//利益を計算する。
	public static long profit( long clcSales , long clcCosts ) {
		
		return clcSales - clcCosts;
	}

}
