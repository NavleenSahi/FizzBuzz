import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testDivisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(15);
		assertEquals("Fizz", result);
	}
	
	//R2: If number is divisible by 5, return "buzz"
	@Test
	public void testDivisibleBy5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(5);
		assertEquals("Buzz", result);
	}
}
