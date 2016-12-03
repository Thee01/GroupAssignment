/*********************************************
* Author: Chloe
* add all values from user choices and 
* calculate sign
*********************************************/
package zodiacGame;

import java.util.Scanner;
/**
 * @author chloe_000
 *
 */
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
			   "Aries",
			   "Taurus",
			   "Gemini",
			   "Cancer",
			   "Leo",
			   "Virgo",
			   "Libra",
			   "Scorpio",
			   "Sagittarius",
			   "Capricorn",
			   "Aquarius",
			   "Pisces"};
	   return signs[n];
   }
   
   public int getUsersZodiacSign(){ //duplicate code??
      calculateUsersZodiacSign();
      return zodiacSignGuess;
   }

}


