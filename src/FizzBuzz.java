
public class FizzBuzz {

	public String buzzzzz(int num) {
		
		boolean isPrime = true;
		
		for (int i = 2; i < num-1; i++) {
			
			if (num % i == 0) {
				
				isPrime = false;
				
				break;
			}
		}
		
		System.out.println("num: " + num);
		System.out.println("is num prime?" + isPrime);
		
		if (isPrime == true) {
			
			if (num % 3 == 0) {
				
				return "fizzwhizz";
			}
			
			else if (num % 5 == 0) {
				return "buzzwhizz";
			}
			return "whizz";
		}
		
		
		if (num % 15 == 0) {
			
			return "fizzbuzz";
		}
		else if (num % 5 == 0) {
			
			return "buzz";
		}
		else if (num % 3 == 0) {
			
			return "fizz";	
		}
		
		return String.valueOf(num);
	}

}
