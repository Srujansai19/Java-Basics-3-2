package junit4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class calciTest {

	@Test
	void test() {
		Calculator cal=mock(Calculator.class);
		Calci c=new Calci(cal);
		
		when(cal.add(3, 4)).thenReturn(7);
		
		int result=c.sum(3, 4);
		assertEquals(7,result);
		
		
	}

}
