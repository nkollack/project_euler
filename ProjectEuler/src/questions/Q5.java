package questions;

import java.util.ArrayList;

import main.Question;

public class Q5 extends Question {
//	2520 is the smallest number that can be divided by each of the numbers
//	from 1 to 10 without any remainder.
//	What is the smallest positive number that is evenly divisible
//	by all of the numbers from 1 to 20?
	
	public Q5(int i) {
		super(i);
	}
	
	public void execute() {
		int sp = smallestPossible(20);
		
		printAnswer(sp);
	}

	private static int bruteForce(int n) {
		ArrayList<Integer> requiredChecks = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			requiredChecks.add(i);
		}
		
		int sp = 0;
		boolean found = false;
		
		while(!found) {
			sp += 1;
			for(int i = requiredChecks.size()-1; i >= 0 ; i--) {
				if(sp % requiredChecks.get(i) != 0) {
					break;
				}
				else if(i == 0) found = true;
			}
		}
		return sp;
	}
	
	private static int smallestPossible(int n) {
		int[] p = {2, 3, 5, 7, 11, 13, 17, 19, 23};
		int sp = 1;
		int i = 0;
		boolean check = true;
		int limit = (int) Math.sqrt(n);
		
		while(p[i] <= n) {
			int pow = 1;
			if(check) {
				if(p[i] <= limit) {
					pow = (int)(Math.log(n)/Math.log(p[i]));
				} else {
					check = false;
				}
			}
			sp *= (int)(Math.pow(p[i], pow));
			i += 1;
		}
		return sp;
	}
}
