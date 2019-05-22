import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	/*@Test
	void testDivisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(15);
		assertEquals("Fizz", result);
	}
	*/
	//R2: If number is divisible by 5, return "buzz"
	@Test
	public void testDivisibleBy5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(5);
		assertEquals("buzz", result);
	}
	
	//R3
	@Test
	public void testDivisibleBy5and3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(15);
		assertEquals("fizzbuzz", result);
	}
	
	//R4
	@Test
	public void testOtherNumber() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(4);
		assertEquals("4", result);
	}
	
}
