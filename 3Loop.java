package loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
       
        int num, guess;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number from 0 to 1000:");
        num = keyboard.nextInt();
       
         
        
       do{   
        System.out.println("Guess a number:");
        guess = keyboard.nextInt();
        
        if (num != guess)
            {
                if (num % 2 == 0 ) {
                    System.out.println("The number to be guessed is Even");}
                  else { 
                    System.out.println("The number to be guessed is Odd");}
            }
        else {System.out.println("Correct");}
           
       } while (num != guess);
        }
    }        
