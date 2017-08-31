package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestPalindromicWord {
	
	public boolean testPalind(String s) {
		String lowercaseString = s.toLowerCase();
		int length = lowercaseString.length();
		for (int i = 0; i < (length/2); i++) {
			for (int j = length; j > length / 2; j--) {
				if (lowercaseString.charAt(i) == lowercaseString.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String[] splitString (String s) {
		String [] arr = null;
		char regrex = ' ';
		switch (regrex) {
		case ' ':
		case ',':
		case '-':
		case '.':
			arr = s.split(s, regrex);
			break;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		TestPalindromicWord obj = new TestPalindromicWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something: ");
		String s = scanner.nextLine();
		if(obj.testPalind(s)) {
			System.out.println(s + " is a palindrome");
		}
//		String [] arr = obj.splitString(s);
//		for (int i = 0; i < arr.length; i++) {
//			if(obj.testPalind(arr[i])) {
//				System.out.println(s + " is a palindrome");
//			} else {
//				System.out.println(s + " is not a palindrome");
//			}
//		}
	}
}
