/****************************
* Author: Chloe and Jude
****************************/
package zodiacGame;

import java.util.Scanner;
public class Dialogue{
	
	Scanner input = new Scanner(System.in);
   
   public void greeting(){
	   System.out.println("Hi. What's your name?");
	   String name = input.nextLine();
	   System.out.printf("Hi %s. My name is 'Zodiac guess game 2.0 %n"
	   		+ "Do you want to talk about astrology? (Yes/No)", name);
	   String yesOrNo = input.next();
	   switch(yesOrNo.toUpperCase()){
	   		case "YES":
	   			System.out.println("Yas! I bet I can guess what your zodiac sign is.");
	   			break;
	   		case "NO":
	   		System.out.println("What, like you have something better to do? SIT DOWN. I bet I can guess what your sign is.");
	   			break;
	   			
	    return;
	}
	   
	public void question1(){
		System.out.println("Good for you! Next Question.");	
	}
		   
	   
	}
	   
	   
	   
   }

}
