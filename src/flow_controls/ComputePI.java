package flow_controls;

import java.util.Scanner;

public class ComputePI {

	public double compute(int maxDenominator) {
		double sum = 0.0;
		for (int i = 1; i <= maxDenominator; i += 2) {
			if (i % 4 == 1) {
				sum += 1.0 / i;
			} else if (i % 4 == 3) {
				sum -= 1.0 / i;
			}
		}
		return 4.0 * sum;
	}

	public static void main(String[] args) {
		ComputePI computePI = new ComputePI();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max denominator");
		int maxDenominator = scanner.nextInt();
		double piNumber = computePI.compute(maxDenominator);
		System.out.println("PI = " + piNumber);
		scanner.close();
	}

}
