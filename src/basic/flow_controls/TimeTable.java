package basic.flow_controls;

import java.util.Scanner;

public class TimeTable {
	
	public void draw (int n) {
		for (int row = 1; row <= n; row++) {
			System.out.printf("%2d %2s", row, "|");
			for (int col = 1; col <= n; col++) {
				int value = row * col;
				System.out.printf(" %2d ", value);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TimeTable timeTable = new TimeTable();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		System.out.printf("%2s %2s ", "*", "|");
		for (int i = 1; i <= n; i++) {
			System.out.printf("%2d  ", i);
		}
		System.out.println("\n-------------------------------------");
		timeTable.draw(n);
		scanner.close();

	}

}
