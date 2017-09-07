package basic.flow_controls;

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

	public void drawB(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = n - 1; col >= row; col--) {
				System.out.printf("%2s", "#");
			}
			System.out.println();
		}
	}

	// public void drawC(int n) {
	// for(int row = 0; row < n; row++) {
	// for (int col = row; col < n; col++) {
	// System.out.printf("%2s", " ");
	// }
	// System.out.println();
	// }
	// }

	public void drawC(int n) {
		for (int row = n - 1; row >= 0; row--) {
			for (int col = n - 1; col > row; col--) {
				System.out.printf("%2s", " ");
			}
			for (int k = 0; k <= row; k++) {
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
		printPattern.drawC(n);
		scanner.close();
	}

}
