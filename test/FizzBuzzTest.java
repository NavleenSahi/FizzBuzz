import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testDivisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(27);
		assertEquals("fizz", result);
	}
	
	//R2: If number is divisible by 5, return "buzz"
	@Test
	public void testDivisibleBy5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(10);
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
	
	//R5
	@Test
	public void testPrimeNumber() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzzzzz(11);
		assertEquals("whizz", result);
	}
	
	//R6
	@Test
	public void testAppendWhizz() {
		FizzBuzz b = new FizzBuzz();
		
		String result = b.buzzzzz(3);
		assertEquals("fizzwhizz", result);
	
	result = b.buzzzzz(5);
	assertEquals("buzzwhizz", result);
}
}
