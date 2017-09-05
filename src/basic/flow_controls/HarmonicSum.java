package basic.flow_controls;

import java.util.Scanner;

public class HarmonicSum {

	public double sumL2R(int maxDenominator) {
		double sumL2R = 0.0;
		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
			sumL2R += 1.0 / denominator;
		}
		return sumL2R;
	}

	public double sumR2L(int maxDenominator) {
		double sumR2L = 0.0;
		for (int i = maxDenominator; i >= 1; i--) {
			sumR2L += 1.0 / i;
		}
		return sumR2L;
	}

	public static void main(String[] args) {
		HarmonicSum harmonicSum = new HarmonicSum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max denominator: ");
		int maxDenominator = scanner.nextInt();
		System.out.println("The sum from left to right is: " + harmonicSum.sumL2R(maxDenominator));
		System.out.println("The sum from right to left is: " + harmonicSum.sumR2L(maxDenominator));
		scanner.close();
	}

}
