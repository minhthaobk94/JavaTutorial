package loop;

import java.util.Scanner;
/**
 * Check pass/fail a number input from keyboard
 * @author MinhThao
 *
 */
public class CheckPassFail {
	
	/*
	 * This is check pass/fail function
	 * Input a number (int)
	 */
	public void checkPassFail(int mark) {
		if (mark >= 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
	
	public static void main(String[] args) {
		CheckPassFail obj = new CheckPassFail();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number you want to check: ");
		int markInput = Integer.parseInt(scanner.nextLine());
		obj.checkPassFail(markInput);
		System.out.println("\nDONE");
	}
}
