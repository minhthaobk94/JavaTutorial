package basic.flow_controls;

public class SumAndAverage {
	
	public int sum() {
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
	
		
		/*
		 * Using "do-while" loop
		int i = 0;
		do {
			total += i;
			i++;
		} while (i <= 100);
		*/
		
		/*
		 * Using "while-do" loop
		int i = 0;
		while(i <= 100) {
			total += i;
			i++;
		}
		*/
		return total;
	}
	
	public float average(int sum) {
		float avg = (float) sum / 100;
		return avg;
	}
	
	public void averageWithCount() {
		float avg;
		int total = 0;
		int count = 0;
		for (int i = 111; i <= 8899; i++) {
			total += i;
			count++;
		}
		avg = total / count;
		System.out.println("The sum is " + total);
		System.out.println("The average is " + avg);
	}
	
	public void averageOfOdd() {
		int total = 0;
		for (int i = 1; i <= 100; i++){
			if(i % 2 == 1) {
				total += i;
			}
		}
		System.out.println("The sum is " + total);
		System.out.println("The average is " + average(total));
	}
	
	public void averageOfNumDivSeven() {
		int total = 0;
		for (int i = 1; i <= 100; i++){
			if(i % 7 == 0) {
				total += i;
			}
		}
		System.out.println("The sum is " + total);
		System.out.println("The average is " + average(total));
	}
	
	public int sumOfSquares() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <=100; j++) {
				if(i == j) {
					total += i*j;
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAndAverage obj = new SumAndAverage();
		
		int sum = obj.sum();
		System.out.println("The sum is " + sum);
		
		float avg = obj.average(sum);
		System.out.println("The average is " + avg);
		
		obj.averageWithCount();
		
		obj.averageOfOdd();
		
		obj.averageOfNumDivSeven();
		
		System.out.println("Sum of the squares is " + obj.sumOfSquares());
		
	}

}
