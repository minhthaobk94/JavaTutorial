package string;

import java.util.Scanner;

public class CheckVowelsDigits {

	public int countVowels(String input) {
		int vowelsCount = 0;
		String lowercaseString = input.toLowerCase();

		for (int i = 0; i < lowercaseString.length(); i++) {
			char letter = lowercaseString.charAt(i);
			switch (letter) {
			case 'a':
			case 'i':
			case 'u':
			case 'e':
			case 'o':
				vowelsCount++;
				break;
			}
		}
		return vowelsCount;
	}

	public int countDigits(String input) {
		int digitsCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			if (letter >= '0' && letter <= '9') {
				digitsCount++;
			}
		}
		return digitsCount;
	}

	public float percentages(int count, int length) {
		float percent = (float) count * 100 / length;
		return percent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckVowelsDigits obj = new CheckVowelsDigits();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something: ");
		String s = scanner.nextLine();
		int vowelsCount = obj.countVowels(s);
		int digitsCount = obj.countDigits(s);
		System.out.printf("Number of vowels: %d (%.2f)", vowelsCount, obj.percentages(vowelsCount, s.length()));
		System.out.printf("\nNumber of digits: %d (%-1.2f)", digitsCount, obj.percentages(digitsCount, s.length()));
		scanner.close();
	}

}
