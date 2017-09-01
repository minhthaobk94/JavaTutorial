package string;

import java.util.Scanner;

public class Oct2Dec {
	int dec;
	public int convertOct2Dec (String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '7') {
				dec += (input.charAt(i) - '0') * Math.pow(8, input.length() - i -1);
			} else {
				System.exit(0);
			}
		}
		return dec;
	}
	public static void main(String[] args) {
		Oct2Dec oct2Dec = new Oct2Dec();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Octor: ");
		String input = scanner.nextLine();
		System.out.printf("Decimal of %s is %d", input, oct2Dec.convertOct2Dec(input));
		scanner.close();
	}
}
