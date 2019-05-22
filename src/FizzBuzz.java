
public class FizzBuzz {

	public String buzzzzz(int num) {
		if (num % 15 == 0) {
			return "fizzbuzz";
		}
		else if (num % 5 == 0) {
			return "buzz";
		}
		return "fizz";

	}

}
