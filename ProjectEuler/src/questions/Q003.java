package questions;

import main.Question;

public class Q003 extends Question {
//	The prime factors of 13195 are 5, 7, 13 and 29.
//	What is the largest prime factor of the number 600851475143 ?
	
	public Q003(int i) {
		super(i);
	}
	
	public void execute() {
		printAnswer(lpf(600851475143L));
	}
	
	private static long lpf(long n) {
		long lpf = 1L;
		long div = 2L;
		
		while(n > 1) {
			if(n % div == 0) {
				lpf = div;
				n /= div;
			}
			div += 1;
		}
		
		return lpf;
	}
}
