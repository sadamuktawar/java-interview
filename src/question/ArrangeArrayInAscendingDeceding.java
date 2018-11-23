package question;

import java.util.Arrays;

public class ArrangeArrayInAscendingDeceding {
	public static void main(String[] args) {
		int[] numbers = { 100, 10, 200, 20, 300 };
		Arrays.sort(numbers);
		System.out.println("Ascending oreder :");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Decending Oreder : ");
		for (int j = numbers.length; j < 0; j++) {
			System.out.println("Decending Oreder :" + numbers[j]);
		}

	}
}
