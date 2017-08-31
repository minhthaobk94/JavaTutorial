package string;

import java.util.Scanner;

public class CheckVowelsDigits {

	public int checkVowels(String s) {
		int vowelsCount = 0;
		String lowercaseString = s.toLowerCase();

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

	public int checkDigits(String s) {
		int digitsCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
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
		int vowelsCount = obj.checkVowels(s);
		int digitsCount = obj.checkDigits(s);
		System.out.println("Number of vowels: " + vowelsCount + " (" + obj.percentages(vowelsCount, s.length()) + "%)");
		System.out.println("Number of digits: " + digitsCount + " (" + obj.percentages(digitsCount, s.length()) + "%)");
	}

}
