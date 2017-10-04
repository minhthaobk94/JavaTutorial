package basic.string;

import java.util.Scanner;

public class TestPalindromicPhrase {

	// Check isLetter to compare
	public boolean isLetter(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}

	// Test palindromic
	public boolean testPalindPhrase(String input) {
		String st = input.toLowerCase();
		int fwIndex = 0, bwIndex = st.length() - 1;
		char fwLetter = st.charAt(fwIndex);
		char bwLetter = st.charAt(bwIndex);
		while (fwIndex < bwIndex) {
			if (!isLetter(fwLetter) || !isLetter(bwLetter) || fwLetter != bwLetter) {
				return false;
			} else {
				fwIndex++;
				bwIndex--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		TestPalindromicPhrase testPalindromicPhrase = new TestPalindromicPhrase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Something: ");
		String input = scanner.nextLine();
		if (testPalindromicPhrase.testPalindPhrase(input)) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
		scanner.close();
	}

}
