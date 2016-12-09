
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
			// if on question 5,8 or 11 will call the method that will help get
			// user input for the 13 option
			if (i == 5 || i == 8 || i == 11) {
				getInputFor13Choice(i);
			} else {
				getInput();
			}
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
			if (userChoice < 1 || userChoice > 12) {
				System.out.println("Are you kidding me? This is really simple. 1-12. Try again");
			} else {
				calculate.addUserChoice(userChoice);
			}
		} while (userChoice < 1 || userChoice > 12);
	}

	/**
	 * handles input for when there is a 13th option.
	 */
	private static void getInputFor13Choice(int question) {
		int userChoice = 0;
		do {
			userChoice = input.nextInt();
			if (userChoice < 1 || userChoice > 13) {
				System.out.println("Are you kidding me? This is really simple. 1-12. Try again");
			} else if(userChoice == 13) 
			{
			switch(question){
				case 5: dialogue.question5Choice13();
					break;
				case 8: dialogue.question5Choice13();//change to 8
					break;
				case 11: dialogue.question5Choice13();//change to 11
					break;	
			}
			}
			else{
				calculate.addUserChoice(userChoice);
			}
		} while (userChoice < 1 || userChoice > 13);
	}

	private static void displayUsersZodiacSign() {
		int zodiacSignIndex = calculate.getUsersZodiacSign();
		System.out.println("~*~*~* " + calculate.zodiacSign(zodiacSignIndex) + " *~*~*~");
		System.out.println(art.getZodiacSignArt(zodiacSignIndex));
	}
}
