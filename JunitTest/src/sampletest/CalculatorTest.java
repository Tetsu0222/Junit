package sampletest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//テストクラス
class CalculatorTest {

	//前処理（各テスト前に共通して実行される）
	@BeforeEach
	void testBefor() {
		
	}
	
	//後処理
	@AfterEach
	void testAfter() {
		
	}
	
	//前処理だが1回だけ実行
	@BeforeAll
	void testAllBefore() {
		
	}
	
	//後処理だが1回だけ実行
	void testAllAfter() {
		
	}
	
	@Test
	void test() {
		int result = Calculator.damage( 15 , 20 );
		
		//引数に指定した値を処理、結果が一致しているか確認
		assertThat( result , is( 5 ));
	}
	
	
	//テストメソッドは戻り値と引数を設定しない。
	
	
}
