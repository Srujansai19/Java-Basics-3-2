package junit1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Add a=new Add();
		int expectedResult=5;
		
		assertEquals(expectedResult,a.sum(2, 3));
	}

}
