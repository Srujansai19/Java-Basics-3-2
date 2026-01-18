package junit3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalciTest {

	@BeforeAll
	static void init() {
		System.out.println("in before all");
	}
	
	@BeforeEach
	void beforeeach() {
		System.out.println("Before each test");
	}

	@Test
	void test() {
		calci c = new calci();
		assertEquals(5, c.add(2, 3));
		System.out.println("test1");
	}
	
//	@Disabled
	@RepeatedTest(2)
	@Test
	void test2() {
		calci c = new calci();
		assertEquals(5, c.add(2, 3));
		System.out.println("test2");
	}
}
