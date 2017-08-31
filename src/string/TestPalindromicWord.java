package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestPalindromicWord {

	public void testPalind(String s) {
		String lowercaseString = s.toLowerCase();
		int length = lowercaseString.length();
		int count = 0;
		for (int i = 0; i < (length / 2) + 1; i++) {
			for (int j = length - 1; j > (length / 2); j--) {
				char a = lowercaseString.charAt(i);
				char b = lowercaseString.charAt(j);
				if (a == b) {
					count++;
				}
			}
		}
		if (count == length / 2) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}

	public static void main(String[] args) {
		TestPalindromicWord obj = new TestPalindromicWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something: ");
		String s = scanner.nextLine();
		obj.testPalind(s);
	}
}
