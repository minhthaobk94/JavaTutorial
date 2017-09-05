package flow_controls;

import java.util.Scanner;

public class Product1ToN {

	public long compute(int n) {
		long product = 1;
		for (int i = 1; i <= n; i++) {
			product *= i;
		}
		return product;
	}

	public static void main(String[] args) {
		Product1ToN product1ToN = new Product1ToN();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scanner.nextInt();
		System.out.printf("Product 1 to %d is %d", n, product1ToN.compute(n));
		scanner.close();
	}

}
