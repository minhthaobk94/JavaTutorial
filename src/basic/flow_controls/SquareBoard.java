package basic.flow_controls;

import java.util.Scanner;

public class SquareBoard {

	public void draw(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SquareBoard squareBoard = new SquareBoard();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		squareBoard.draw(n);
		scanner.close();
	}

}
