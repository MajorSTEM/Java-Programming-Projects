//Flag-controlled while loop.
//Guessing the number game.
//This Porgram is written by Isaiah Smith

import java.util.*;
import java.lang.Math;

public class FlagControlledLoop
{
    static Scanner console = new Scanner(System.in);

    public static void main (String[] args)
    {
            //declare the variables
        int num;       //variable to store the random number
        int guess;     //variable to store the number
                       //guessed by the user

        boolean done;  //boolean variable to control the loop

        num = (int) (Math.random() * 100);              //Line 1

        done = false;                                   //Line 2
		int attempts=0;

        while (!done)                                   //Line 3
        {                                               //Line 4
			
				if(attempts==5){
			System.out.println("You lose! Too many attempts, game over!");
			break;
			}
		
            System.out.print ("Enter an integer greater"
                           + " than or equal to 0 and "
                           + "less than 100: ");        //Line 5
            guess = console.nextInt();                  //Line 6
            System.out.println();                       //Line 7

            if (guess == num)                           //Line 8
            {                                           //Line 9
                System.out.println("You guessed the "
                                 + "correct number.");  //Line 10
                done = true;                            //Line 11
            }                                           //Line 12
            else if (guess < num)  {                     //Line 13
                System.out.println("Your guess is "
                                 + "lower than "
                                 + "the number.\n"
                                 + "Guess again!");     //Line 14
								 attempts++;
	}
            else     {                                   //Line 15
                System.out.println("Your guess is "
                                 + "higher than "
                                 + "the number.\n"
                                 + "Guess again!");     //Line 16
			attempts++; 
			}
        } //end while                                   //Line 17
    }                                                   //Line 18
}

