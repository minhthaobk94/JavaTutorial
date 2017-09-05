package basic.flow_controls;

import java.util.Scanner;
/**
 * Check odd/even a number input from keyboard
 * @author MinhThao
 *
 */
public class CheckOddEven {

	/*
	 * This is check odd/even function
	 * Input a number (int)
	 */
	public void checkOddEden(int number) {
		if(number % 2 == 1) {
			System.out.println("Odd Number");
		} else {
			System.out.println("Even Number");
		}
	}
	
	public static void main(String[] args) {
		CheckOddEven obj = new CheckOddEven();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number you want to check: ");
		int numberInput = Integer.parseInt(scanner.nextLine());
		obj.checkOddEden(numberInput);
		System.out.println("\nBYE!");
		scanner.close();
	}
}
