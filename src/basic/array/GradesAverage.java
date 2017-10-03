package basic.array;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numStudents = scanner.nextInt();
		int[] grades = new int[numStudents];
		int sum = 0;

		for (int i = 1; i <= numStudents; i++) {
			System.out.println("Enter grade for student " + i + ": ");
			grades[i - 1] = scanner.nextInt();
			while (grades[i - 1] < 0 || grades[i - 1] > 100) {
				System.out.println("Invalid grade, try again....");
				System.out.println("Enter grade for student " + i + ": ");
				grades[i - 1] = scanner.nextInt();
			}
		}
		for (int j = 0; j < numStudents; j++) {
			sum += grades[j];
		}
		System.out.printf("The average is: %.2f", (float) sum / numStudents);
		scanner.close();
	}

}
