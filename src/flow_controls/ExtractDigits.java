package flow_controls;

import java.util.Scanner;

public class ExtractDigits {

	public void extract(int number) {
		while (number > 0) {
			int digit = number % 10;
			System.out.print(digit + " ");
			number = number / 10;
		}
	}

	public static void main(String[] args) {
		ExtractDigits extractDigits = new ExtractDigits();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number want to extract: ");
		int number = scanner.nextInt();
		extractDigits.extract(number);
		scanner.close();
	}

}
