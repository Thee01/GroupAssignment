package finalProject1400;

import java.util.Scanner;

public class zodiacGame {
	private static Scanner input = new Scanner(System.in);
	private static Calculate calculate = new Calculate();
	private static Questions questions = new Questions();

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			displayQuestions(i);
			getInput();
		}
		displayUsersZodiacSign();
	}

	/**
	 * displays questions
	 */
	private static void displayQuestions(int questionNumber) {
		System.out.println(questions.getQuestion(questionNumber));
	}

	/**
	 * asks user for input and then sends it to the method calculate to add to
	 * the array.
	 * 
	 * @return
	 */
		private static void getInput() {
		int userChoice = 0;
		do {
			userChoice = input.nextInt();
			if (userChoice == 0) {
				System.out.println("Are you kidding me? This is really simple. 1-12. Try again");
			} else {
				calculate.addUserChoice(userChoice);
			}
		} while (userChoice < 1 || userChoice > 12);
	}

	/**
	 * gets the index with the highest
	 */
	private static void displayUsersZodiacSign() {
		Answers answers = new Answers();

		int zodiacSignIndex = calculate.getUsersZodiacSign();

		System.out.println(answers.getAnswer(zodiacSignIndex));
	}
}
