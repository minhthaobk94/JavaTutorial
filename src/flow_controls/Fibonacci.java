package flow_controls;

import java.util.Scanner;

public class Fibonacci {

	public void fibo(int nMax) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int sum = 0;

		System.out.println("The first " + nMax + " Fibonacci numbers are:");
		System.out.print(fnMinus2 + " " + fnMinus1 + " ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			System.out.print(fn + " ");
			sum += fn;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			n++;
		}
		System.out.println();
		System.out.println("The average: " + (double) sum / nMax);
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int nMax = scanner.nextInt();
		fibonacci.fibo(nMax);
		scanner.close();
	}

}
