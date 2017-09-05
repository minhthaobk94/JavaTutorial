package flow_controls;

import java.util.Scanner;

public class Tribonacci {

	public void tribo(int nMax) {
		int n = 4;
		int fnMinus1 = 2; // 3
		int fnMinus2 = 1; // 2
		int fnMinus3 = 1; // 1
		int fn;

		System.out.println("The first " + nMax + " Tribonacci numbers are:");
		System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1 + " ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			System.out.print(fn + " ");
			fnMinus3 = fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			n++;
		}
	}

	public static void main(String[] args) {
		Tribonacci tribonacci = new Tribonacci();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int nMax = scanner.nextInt();
		tribonacci.tribo(nMax);
		scanner.close();
	}

}
