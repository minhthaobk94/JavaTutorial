package basic.flow_controls;

import java.util.Scanner;

public class CheckedBoard {

	public void draw(int n) {
		for (int row = 0; row < n; row++) {
			if (row % 2 != 0) {
				System.out.print(" ");
			}
			for (int col = 0; col < n; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CheckedBoard checkedBoard = new CheckedBoard();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		checkedBoard.draw(n);
		scanner.close();
	}

}
