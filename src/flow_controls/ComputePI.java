package flow_controls;

public class ComputePI {

	public void compute() {
		double sum = 0.0;
		int maxDenominator = 10000000;
		for (int i = 1; i <= maxDenominator; i += 2) {
			if (i % 4 == 1) {
				sum += 1.0 / i;
			} else if (i % 4 == 3) {
				sum -= 1.0 / i;
			} else {
				System.out.println("The computer has gone crazy?!");
			}
		}

		System.out.println("PI = " + 4.0 * sum);

	}

	public static void main(String[] args) {
		ComputePI computePI = new ComputePI();
		computePI.compute();
	}

}
