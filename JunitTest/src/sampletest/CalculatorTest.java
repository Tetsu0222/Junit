package sampletest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		int result = Calculator.damage( 15 , 20 );
		assertThat( result , is( 5 ));
	}

}
