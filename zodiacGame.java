/*
 * Main
 */
package zodiacGame;

import java.util.Scanner;

public class ZodiacGame {
	private static Scanner input = new Scanner(System.in);
	private static Calculate calculate = new Calculate();
	private static Questions question = new Questions();
	private static Dialogue dialogue = new Dialogue();
	private static ZodiacASCIIArt art = new ZodiacASCIIArt();

	public static void main(String[] args) {
		dialogue.greeting();
		System.out.println();
		
		for (int i = 1; i <= 12; i++) { 
			displayQuestions(i);
			getInput();
			System.out.println(dialogue.questionReplies(i));
			System.out.println();
			input.nextLine();
			input.nextLine();
		}
		System.out.println();
		dialogue.ending();
		displayUsersZodiacSign();
	
	}
	/**
	 * displays questions
	 */
	private static void displayQuestions(int questionNumber) {
		System.out.println(question.getQuestion(questionNumber));
	}

	/**
	 * asks user for input and then sends it to the method calculate to add to
	 * the array.
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

	
	private static void displayUsersZodiacSign() {
		int zodiacSignIndex = calculate.getUsersZodiacSign();
		System.out.println("~*~*~* " + calculate.zodiacSign(zodiacSignIndex)+ " *~*~*~");
		System.out.println(art.getZodiacSignArt(zodiacSignIndex));
	}
}
