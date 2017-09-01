package string;

import java.util.Scanner;

public class Bin2Dec {
	public int convertBin2Dec(String input) {
		int dec = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '1') {
				dec += Math.pow(2, input.length() - i - 1);
			} else if (input.charAt(i) != '0'){
				System.out.println("Error");
				System.exit(0);;
			}
		}
		return dec;
	}

	public static void main(String[] args) {
		Bin2Dec bin2Dec = new Bin2Dec();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Binary: ");
		String input = scanner.nextLine();
		System.out.println("Decimal is " + bin2Dec.convertBin2Dec(input));
		scanner.close();
	}

}
