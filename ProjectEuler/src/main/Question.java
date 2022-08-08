package main;

public abstract class Question {
	protected int q_num;
	protected Question(int questionNumber) {
		this.q_num = questionNumber;
	}
	private String getQ_num() {
		return String.format("%03d", q_num);
	}
	public abstract void execute();
	protected void printAnswer() {
		System.out.println("Q" + getQ_num() + " Answer: INCOMPLETE");
	}
	protected void printAnswer(int answer) {
		System.out.println("Q" + getQ_num() + " Answer: " + answer);
	}
	protected void printAnswer(long answer) {
		System.out.println("Q" + getQ_num() + " Answer: " + answer);
	}
}
