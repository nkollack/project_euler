package questions;

import main.Question;

public class Q001 extends Question {
//	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//	The sum of these multiples is 23.
//	Find the sum of all the multiples of 3 or 5 below 1000.
	
	public Q001(int i) {
		super(i);
	}

	public void execute( ) {
		int sum = 8;
		for(int i = 6; i < 1000; i++) {
			if(isMultipleOf(i, 3) || isMultipleOf(i, 5)) sum += i;
		}
		printAnswer(sum);
	}
	
	private static boolean isMultipleOf(int i, int n) {
		if(i % n == 0) return true;
		else return false;
	}
}
