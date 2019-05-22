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

}
