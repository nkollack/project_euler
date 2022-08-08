package questions;

import main.Question;

public class Q7 extends Question {
//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
//	we can see that the 6th prime is 13.
//	What is the 10001st prime number?

	public Q7(int i) {
		super(i);
	}
	
	public void execute() {
		int nth = nthPrime(10001);
		
		printAnswer(nth);
	}
	
	private static int nthPrime(int n) {
		int i = 2;
		int sp = 0;
		
		while(i < n) {
			sp += 6;
			if(isPrime(sp+1)) i += 1;
			if(isPrime(sp-1)) i += 1;
		}
		
		return sp + 1;
	}
	
	private static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n % 2 == 0) return n == 2;
		if(n % 3 == 0) return n == 3;
		
		int limit = (int)(Math.sqrt(n) + 1);
		int i = 5;
		
		while(i <= limit) {
			if(n % i == 0) return false;
			if(n % (i+2) == 0) return false;
			i += 6;
		}
		return true;
	}
}
