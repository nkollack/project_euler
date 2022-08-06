package main;

public abstract class Question {
	protected int questionNumber;
	protected Question() {
		this(0);
	}
	protected Question(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public abstract void execute();
	protected void printAnswer(int answer) {
		System.out.println("Q" + questionNumber + " Answer: " + answer);
	}
}
