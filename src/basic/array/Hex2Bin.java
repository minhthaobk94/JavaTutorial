package basic.array;

import java.util.Scanner;

public class Hex2Bin {

	public String convertH2B(String s) {
		String input = s.toLowerCase();
		String[] hexBits = { "0000 ", "0001 ", "0010 ", "0011 ", "0100 ", "0101 ", "0110 ", "0111 ", "1000 ", "1001 ", "1010 ",
				"1011 ", "1100 ", "1101 ", "1110 ", "1111 " };
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '0':
				result += hexBits[0];
				break;
			case '1':
				result += hexBits[1];
				break;
			case '2':
				result += hexBits[2];
				break;
			case '3':
				result += hexBits[3];
				break;
			case '4':
				result += hexBits[4];
				break;
			case '5':
				result += hexBits[5];
				break;
			case '6':
				result += hexBits[6];
				break;
			case '7':
				result += hexBits[7];
				break;
			case '8':
				result += hexBits[8];
				break;
			case '9':
				result += hexBits[9];
				break;
			case 'a':
				result += hexBits[10];
				break;
			case 'b':
				result += hexBits[11];
				break;
			case 'c':
				result += hexBits[12];
				break;
			case 'd':
				result += hexBits[13];
				break;
			case 'e':
				result += hexBits[14];
				break;
			case 'f':
				result += hexBits[15];

			default:
				System.out.println("Not hexa");
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Hex2Bin hex2Bin = new Hex2Bin();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hexadecimal: ");
		String s = scanner.nextLine();
		System.out.printf("The equivalent binary for hexadecimal %s is: %s ", s, hex2Bin.convertH2B(s));
		scanner.close();
	}

}
