package basic.string;

import java.util.Scanner;

public class TestPalindromicWord {

	public boolean testPalind(String s) {
		String lowercaseString = s.toLowerCase();
		int length = lowercaseString.length();
		for (int i = 0; i < (length / 2) + 1; i++) {
			char a = lowercaseString.charAt(i);
			char b = lowercaseString.charAt(length - 1 - i);
			if (a != b) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		TestPalindromicWord obj = new TestPalindromicWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something: ");
		String s = scanner.nextLine();

		// check word
		if (obj.testPalind(s)) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}
		scanner.close();

	}
}
