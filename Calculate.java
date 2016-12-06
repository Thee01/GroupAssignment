/*
 * logic to calculate user's sign
 */

package zodiacGame;

import java.util.Scanner;

public class Calculate{
   Scanner input = new Scanner(System.in);
   private int[] zodiacChoices = new int[13];
   private int zodiacSignGuess;
   private int userChoice;
   
   public int getInput(){
      this.userChoice = userChoice;	
		do {
			userChoice = input.nextInt();
		}while(userChoice >= 1 || userChoice <= 12);       
      return userChoice;
   }
   
  	public void addUserChoice(int index){
      zodiacChoices[index]++; 
	   return; 
	}
	
  public int calculateUsersZodiacSign(){
        for(int i = 1; i <= 12; i++)
        {
            if(zodiacChoices[i] > zodiacSignGuess)
            {
                zodiacSignGuess = i;
            }
        }
        return zodiacSignGuess;
   }
  
   public String zodiacSign(int n){
	   String[] signs = {
			   "n/a",
			   "A R I E S",
			   "T A U R U S",
			   "G E M I N I",
			   "C A N C E R",
			   "L E O",
			   "V I R G O",
			   "L I B R A",
			   "S C O R P I O",
			   "S A G I T A R R I U S",
			   "C A P R I C O R N",
			   "A Q U A R I U S",
			   "P I S C E S"};
	   return signs[n];
   }
   
   public int getUsersZodiacSign(){ //duplicate code??
      calculateUsersZodiacSign();
      return zodiacSignGuess;
   }

}


