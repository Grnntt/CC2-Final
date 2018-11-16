    
package calculator;

import java.util.Scanner;


public class Calculator {
    
    public static void main(String[] args) {
        
        int num1 ;
        int num2 ;
        String operation;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first number");
        num1 = input.nextInt();
        
        System.out.println("Please enter the second number");
        num2 = input.nextInt();
        
        Scanner op = new Scanner(System.in);
        
        System.out.println("Please enter a operation");
        operation = op.next();
        
        if ( operation.equals("+") || operation.equals("Add"))
        {
            System.out.println("The answer is:" + (num1 + num2));
        }
       
        else if( operation.equals("*")  || operation.equals("Multiply"))
        {
            System.out.println("The answer is:" + (num1 * num2));
        }
        
        else if( operation.equals("-")  || operation.equals("Substract"))
        {
            System.out.println("The answer is:" + (num1 - num2));
        }
        
        else if( operation.equals("/")  || operation.equals("Divide"))
        {
            System.out.println("The answer is:" + (num1 / num2));
        }
        
        else if (operation.equals("%") || operation.equals("Modulo"))
        {
            System.out.println("The answer is:" + (num1 % num2));
        }
        
        else System.out.println("Invalid Input");
        
    }
    
}
