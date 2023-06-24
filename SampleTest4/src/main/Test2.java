package main;

import java.util.List;
import java.util.stream.IntStream;

public class Test2 {
	
	public static void test2() {
		
		//3の倍数のリスト
		List<Integer> fizzList = IntStream.rangeClosed( 1 , 100 )
				.filter( number -> number % 3 == 0 )
				.boxed()
				.toList();
		
		//5の倍数のリスト
		List<Integer> buzzList = IntStream.rangeClosed( 1 , 100 )
				.filter( number -> number % 5 == 0 )
				.boxed()
				.toList();
		
		//3と5の倍数のリスト
		List<Integer> fizzbuzzList = fizzList.stream()
				.filter( number -> buzzList.contains( number ))
				.toList();
		
		for( Integer number : fizzbuzzList ) {
			System.out.println( number + "はfizzbuzz" );
		}
		
	}

}
