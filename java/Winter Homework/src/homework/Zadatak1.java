package homework;

public class Zadatak1 {

	public static void main(String[] args) {

	final int NUMBER_OF_NUMBERS = 24;
	java.util.Random rng = new java.util.Random();

	int[] numbers = new int[NUMBER_OF_NUMBERS];
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = rng.nextInt(Math.abs(Integer.MAX_VALUE / 256));
	}

	int sum = 0, smallest = Integer.MAX_VALUE, largest = 0;

	for (int number : numbers) {
		sum += number;
		if (number > largest)
			largest = number;
		if (smallest > number)
			smallest = number;
	}
	System.out.printf("numberarray is: \n");
	for (int number : numbers) {
		System.out.printf("%d ", number);
	}
	
	System.out.printf("\nSum brojeva je: %d\nNajveci broj je %d\nNajmanji broj je %d.", sum, largest, smallest);
}

}