/****************************
* Author: Chloe and Jude
****************************/
package zodiacGame;

import java.util.Scanner;

public class Dialogue {

	Scanner input = new Scanner(System.in);

	public void greeting() {
		System.out.print("Hi. What's your name? ");
		String name = input.nextLine();
		System.out.printf(
				"Hi %s. My name is 'Zodiac guess game 2.0. Do you want to talk about astrology? (Yes/No) ", name);
		String yesOrNo = input.next();
		switch (yesOrNo.toUpperCase()) {
		case "YES":
			System.out.println("Yas! I bet I can guess what your zodiac sign is. Let's do this.");
			break;
		case "NO":
			System.out.println(
					"What, like you have something better to do? SIT DOWN. I bet I can guess what your sign is. Let's do this.");
			break;
		// add default?
		}
	}

	public void question1() {
		System.out.println("Good for you! Next Question.");
	}

	public void question2() {
		System.out.println("Yikes. Okay, next.");
	}

	public void question3() {
		System.out.println("Honestly I wouldn't want to do that but to each their own.");
	}

	public void question3Choice13() {
		System.out.println("Did I ask you to tell me your dream job wasn't on this list?");
		String yesOrNo = input.next();
		switch (yesOrNo.toUpperCase()) {
		case "YES":
			System.out.println("Can you read? Try again.");
			break;
		case "NO":
			System.out.println("Okay then let's try that again.");
			break;
		}

	}

}
