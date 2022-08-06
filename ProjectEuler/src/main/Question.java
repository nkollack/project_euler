package main;

public abstract class Question {
	protected int questionNumber;
	protected Question(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public abstract void execute();
	protected void printAnswer() {
		System.out.println("Q" + questionNumber + " Answer: INCOMPLETE");
	}
	protected void printAnswer(int answer) {
		System.out.println("Q" + questionNumber + " Answer: " + answer);
	}
}
