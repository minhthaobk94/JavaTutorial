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

	public String[] splitString(String s) {
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case ',':
			case '.':
			case '-':
			case '!':
				s.replace(s.charAt(i), ' ');
			}
		}
		String[] arr = s.split(" ");

		return arr;
	}

	public static void main(String[] args) {
		TestPalindromicWord obj = new TestPalindromicWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something: ");
		String s = scanner.nextLine();
		
		// check word
		obj.testPalind(s);

		//check phrase
		String[] strArray = obj.splitString(s);
		for (int i = 0; i < strArray.length; i++) {
			obj.testPalind(strArray[i]);
		}
	}
}
