package flow_controls;

import java.util.Scanner;

public class PrintDayInWord {

	public void printDay(int number) {
		switch (number) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Not a valid day");
			break;
		}
	}

	public static void main(String[] args) {
		PrintDayInWord dayInWord = new PrintDayInWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		dayInWord.printDay(number);
		scanner.close();
	}

}
