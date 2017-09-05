package flow_controls;

import java.util.Scanner;

public class PrintPattern {

	public void drawA(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.printf("%2s", "#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PrintPattern printPattern = new PrintPattern();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		printPattern.drawA(n);
		scanner.close();
	}

}
