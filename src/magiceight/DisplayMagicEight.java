package magiceight;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class DisplayMagicEight {

	public static void main(String[] args){

		Random magic = new Random();

		Scanner iputAnswer = new Scanner(System.in); 

		
		int magicEight = 1 + magic.nextInt(20) ;
		int numsAmt = 0;
		int numSecret;
		
		ArrayList<String>listResponses = new ArrayList<String>();
		
		String response, question;
		
		boolean success = false;
		
		do{
			do{
				System.out.println("Magic Ball, Will I win the lottery tomorrow? ");
				numSecret = sc.nextInt();
				numsAmt++;
			
				if (numSecret == secretNum) {
					success = true;
				}
				else if (numSecret < secretNum)	{
					System.out.println("You guessed too low, try again?");
				}
				else if (numSecret > secretNum)	{
					System.out.println("You guessed too high, try again?");
					}
			
		}while (!success);
	 	System.out.println("Congratulation!!!! Do you want to try again? (Y/N)");
	 	response = sc.next();
	 }while (response.equalsIgnoreCase("y"));	
  }
}
