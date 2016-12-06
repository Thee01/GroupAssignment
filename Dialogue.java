/***********************************
 * dialogue class holds dialogue
 * methods
 */
package zodiacGame;

import java.util.Scanner;

public class Dialogue {
	private static ZodiacASCIIArt art = new ZodiacASCIIArt();
	Scanner input = new Scanner(System.in);
	
	private String name;
	
	public void greeting() {
		System.out.println(art.getTitle());
		System.out.print("Hi. What's your name? ");
		this.name = input.nextLine();
		
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
						System.out.printf("%nWanna try that again?%n%n"); 
			}
		} while(yesOrNoChoosen == false);
	}	
	public String getName(){
		return name;
	}
	public String questionReplies(int n) {
		String[] questionRepliesArray = { 		
				"n/a",
				"Good for you! Next Question.", 
				"Yikes. You should work on that. Next!", 
				"I would be insecure about that too... anyways. Next question.",
				"Very revealing. Let's move on",
				"Good luck with that.",
				"You are gonna go far kid.",
				"Ugh, me too girl, me too.",
				"At least you have your priorities straight.",
				"Sounds dreamy. We should go sometime.",
				"Almost there.",
				"AWKWARD.",
				"I mean.. I guess that sounds reasonable?",
				"SPICY! I think I know exactly what your sign is.", 
		};
		return questionRepliesArray[n];
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

	public void ending(){
		System.out.println(getName() + " you are totally a");
	}
}
