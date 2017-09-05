package basic.string;

import java.util.Scanner;

public class ReserveString {
	/**
	 * Using StringBuilder to reserve a string
	 * 
	 * @param s
	 * @return
	 */
	public String reverse(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			char charS = s.charAt(i);
			builder.append(charS);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		ReserveString obj = new ReserveString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();
		System.out.println("The reverse of the String " + s + " is " + obj.reverse(s));
		scanner.close();
	}
}
