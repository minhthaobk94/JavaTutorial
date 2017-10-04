package basic.string;

import java.util.Scanner;

public class Hex2Dec {

	public int convertHex2Dec(String input) {
		String str = input.toLowerCase();
		int dec = 0;
		for (int i = 0; i < str.length(); i++) {
			char hexChar = str.charAt(i);
			if (hexChar >= '0' && hexChar <= '9') {
				dec += (hexChar - '0') * Math.pow(16, str.length() - i - 1);
			} else if (hexChar >= 'a' && hexChar <= 'f') {
				dec += (hexChar - 'a' + 10) * Math.pow(16, str.length() - i - 1);
			} else {
				System.exit(0);
			}
		}
		return dec;
	}

	public static void main(String[] args) {
		Hex2Dec hex2Dec = new Hex2Dec();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hexadecimal string: ");
		String input = scanner.nextLine();
		System.out.printf("The equivalent decimal number for hexadecimal %s is: %d", input,
				hex2Dec.convertHex2Dec(input));
		scanner.close();
	}

}
