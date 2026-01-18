package junit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	
	@Test
	void test() {
		Divide d=new Divide();
		assertEquals(2,d.divide(6,3));
	}

}
