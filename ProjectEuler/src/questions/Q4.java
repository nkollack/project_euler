package questions;

import main.Question;

public class Q4 extends Question {
//	A palindromic number reads the same both ways.
//	The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//	Find the largest palindrome made from the product of two 3-digit numbers.

	public Q4(int i) {
		super(i);
	}
	
	public void execute() {
		int lp = largestPalindrome(2);
		
		printAnswer(lp);
	}
	
	private static int largestPalindrome(int size_power) {
		int lp = 0;
		double min_size = Math.pow(10, size_power);
		double n = Math.pow(10, size_power+1) - 1;
		
		for(int i = (int)n; i >= (int)min_size; i--) {
			for(int j = i; j >= (int)min_size; j--) {
				int prod = i * j;
				String prod_string = String.valueOf(prod);
				String reverse = new StringBuilder(prod_string).reverse().toString();
				if(prod_string.equals(reverse) && prod > lp) lp = prod;
			}
		}
		return lp;
	}
	
}
