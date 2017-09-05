package flow_controls;

public class CozaLozaWoza {
	boolean printed;

	public void print() {
		int lowerBound = 1, upperBound = 110;
		for (int i = lowerBound; i <= upperBound; i++) {
			printed = false;
			if (i % 3 == 0) {
				System.out.print("Coza ");
				printed = true;
			}
			if (i % 5 == 0) {
				System.out.print("Loza ");
				printed = true;
			}
			if (i % 7 == 0) {
				System.out.print("Woza ");
				printed = true;
			}
			if (!printed) {
				System.out.print(i + " ");
			}
			if (i % 11 == 0) {
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {
		CozaLozaWoza cozaLozaWoza = new CozaLozaWoza();
		cozaLozaWoza.print();
	}

}
