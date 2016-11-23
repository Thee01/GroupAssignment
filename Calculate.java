/*********************************************
* Author: Chloe
* add all values from user choices and 
* calculate sign
* reading from array starts at 1~~~~~~~
*********************************************/
package finalProject1400;

import java.util.Scanner;

public class Calculate {
	Scanner input = new Scanner(System.in);
	private int[] zodiacChoices = new int[13];
	private int zodiacSignGuess;

	public int getInput(int userChoice) {
		do {
			userChoice = input.nextInt();
		} while (userChoice >= 1 || userChoice <= 12);

		return userChoice;
	}

	public void addUserChoice(int index) {
		zodiacChoices[index]++;
	}

	private void calculateUsersZodiacSign() {
		for (int i = 0; i < 12; i++) {
			if (zodiacChoices[i] > zodiacSignGuess) {
				zodiacSignGuess = i;
			}
		}
	}

	public int getUsersZodiacSign() {
		calculateUsersZodiacSign();
		return zodiacSignGuess;
	}
}