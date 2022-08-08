package questions;

import main.Question;

public class Q006 extends Question {
//	The sum of the squares of the first ten natural numbers is,
//	1^2 + 2^2 + ... + 10^2 = 385
//	The square of the sum of the first ten natural numbers is,
//	(1+2+...+10)^2 = 3025
//	Hence the difference between the sum of the squares of the first ten natural numbers
//	and the square of the sum is 3025 - 385 = 2640.
//	Find the difference between the sum of the squares of the first one hundred natural numbers
//	and the square of the sum.

	public Q006(int i) {
		super(i);
	}
	
	public void execute() {
		int answer = efficient(100);
		
		printAnswer(answer);
	}
	
	private static int sumSquareDiff(int n) {
		return Math.abs(squareOfSeries(n) - squareOfSummedSeries(n));
	}
	
	private static int squareOfSeries(int n) {
		int val = 0;
		for(int i = 1; i <= n; i++) {
			val += Math.pow(i, 2);
		}
		return val;
	}
	
	private static int squareOfSummedSeries(int n) {
		int val = 0;
		for(int i = 1; i <= n; i++) {
			val += i;
		}
		return (int) Math.pow(val, 2);
	}
	
	private static int efficient(int n) {
		int sum = (n * (n+1)) / 2;
		int sum_sqr = (n * (2*n+1) * (n+1)) / 6;
		return (int)Math.pow(sum, 2) - sum_sqr;
	}
}
