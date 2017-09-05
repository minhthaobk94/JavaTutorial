package flow_controls;

public class HarmonicSum {

	public void computeSum() {
		int maxDenominator = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
			sumL2R += 1.0 / denominator;
		}
		System.out.println("The sum from left to right is: " + sumL2R);
		for (int i = maxDenominator; i >= 1; i--) {
			sumR2L += 1.0 / i;
		}
		System.out.println("The sum from right to left is: " + sumR2L);
	}

	public static void main(String[] args) {
		HarmonicSum harmonicSum = new HarmonicSum();
		harmonicSum.computeSum();
	}

}
