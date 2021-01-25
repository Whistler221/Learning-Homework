package exercises;

public class Exercise01 {
	
	public static void main(String[] args) {
		
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}
	
	public static void printPrimeNumbers(int numberOfPrimes) {
		
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0;  // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		
		// Repetedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime number and increse the count
			if (isPrime(number)) {
				count++; // increase the count
			
			if (count % NUMBER_OF_PRIMES_PER_LINE ==0) {
				// Print the number and advance to the new line
				System.out.printf("%-5d\n", number);
			}
			else
				System.out.printf("%-5d", number);
		}
		
		// Check wether the next number is prime
		number++;
		}
	}
	/** Check wether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not prime
			}
		}
		
		return true; // Number is Prime
	}
	}