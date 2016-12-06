/****************************
* Author: Chloe and Jude
****************************/
package zodiacGame;

import java.util.Scanner;

public class Dialogue {

	Scanner input = new Scanner(System.in);
//Kenneth dec 3  
//
//fixed the do while by adding a boolean that will decide when to exit the do while loop
//Also added some line spacing to make console easier to read
	
	public void greeting() {
		System.out.println(art.getTitle());
		System.out.print("Hi. What's your name? ");
		String name = input.nextLine();
		
		boolean yesOrNoChoosen = false;
		do{
			System.out.printf(
					"Hi %s. My name is 'Zodiac guess game 2.0. Do you want to talk about astrology? (Yes/No) ", name);
			String yesOrNo = input.next().toUpperCase();
			
			switch (yesOrNo) {
				case "YES":
					System.out.printf("%nYas! I bet I can guess what your zodiac sign is. Let's do this. %n%n");
					yesOrNoChoosen = true;
					break;
				case "NO":
					System.out.printf(
							"%nWhat, like you have something better to do? SIT DOWN. I bet I can guess what your sign is. Let's do this. %n%n");
					yesOrNoChoosen = true;
					break;
				default:
						System.out.printf("%nWanna try that again?%n%n"); //get this to loop
			}
		} while(yesOrNoChoosen == false);
	    }	
	}
//dec 5 kenneth duran added the rest of the dialogue that displays after the user answers a question
	public String questionReplies(int n) {
		String[] questionRepliesArray = { 		"n/a",
				"Good for you! Next Question.", // Q1
				"Yikes. You should work on that. Next!", // Q2
				"I would be insecure about that too... anyways. Next question.", // Q3
				"Very revealing. Let's move on",
				"Good luck with that.",
				"You are gonna go far kid.",
				"Ugh, me too girl, me too.",
				"At least you have your priorities straight.",
				"Sounds dreamy. We should go sometime.",
				"Almost there.",
				"AWKWARD.",
				" I mean.. I guess that sounds reasonable?",
				"SPICY! I think I know exactly what your sign is.", // Q3
				// continue with addt'l question replies
		};
		return questionRepliesArray[n];
	}
//dec 5 kenneth duran
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
