
package factorialfibonacci;
import java.util.Scanner;
public class FactorialFibonacci {

   
    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input length of array : ");
        int x = sc.nextInt();
        int[] array = new int[x];
        for(int i = 0; i < array.length; i++){
            System.out.print("Input element for index " + i +" : ");
            int ele = sc.nextInt();
            array[i] = ele;
        }
        System.out.print("Operation : fibonacci/factorial : ");
        String choice = sc.next();
        for(int i = 0; i < array.length; i++){
        System.out.print("f(" + array[i] + ") \t");
        }
        System.out.println("");
        if("fibonacci".equals(choice)){
            for(int i = 0; i < array.length; i++){
                System.out.print(fibonacci(array[i]) + "\t");
            }
        }else if("factorial".equals(choice)){
            for(int i = 0; i < array.length; i++){
                System.out.print(factorial(array[i]) + "\t");
            }
        }
    }
    public static int fibonacci(int a){
        if(a<=1){
            return a;
        }else{
            return fibonacci(a-1)+fibonacci(a-2);
        }
    }
    public static int factorial(int a){
        int i = 1;
        int factorial = 1;
        while(i <= a)
        {
            factorial *= i;
            i++;
        }
        return factorial;
    }
    
}
