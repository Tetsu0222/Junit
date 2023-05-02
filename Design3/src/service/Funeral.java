package service;

import java.util.List;

public class Funeral {
	
	public static List<Integer> execution( List<Integer> turnList , Integer targetNumber ){
		
		List<Integer> newTurnList = turnList.stream()
				.filter( s -> s != targetNumber )
				.toList();
		
		return newTurnList;
	}

}
