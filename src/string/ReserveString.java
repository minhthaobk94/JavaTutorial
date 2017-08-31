package string;

import java.util.Scanner;

public class ReserveString {
	/**
	 * Using StringBuilder to reserve a string
	 * 
	 * @param s
	 * @return
	 */
	public String reverse(String s) {
		String reserveString;
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			char charS = s.charAt(i);
			builder.append(charS);
		}
		reserveString = builder.toString();
		return reserveString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReserveString obj = new ReserveString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();
		System.out.println("The reverse of the String " + s + " is " + obj.reverse(s));
	}
}
