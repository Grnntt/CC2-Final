package fibonacci;

import java.util.Scanner;

public class Fibonacci {
public static int n;
public static int num;
public static int i;
public static int a;
public static int k;


  public static void main(String[] args) {
    
      display();
      }
  
        public static int user(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input of Desired number: ");
        n = sc.nextInt();
        return n;
        }
        
       public static int algorithm(int n){
         if(n <= 1)
        {
            return n;
        }else
     
        return algorithm(n-1) + algorithm(n-2);

    }
    
    public static int display(){
     
       k = algorithm(user());
       for(int g=0; g <=k; g++){
        System.out.print("f("+g+")\t");
      }
       
       System.out.println("");
       for(i=n;i>=0;i--){// inverse
       //for (i=0; i <=k; i++){ hindi inverses
           for(a=0;a<=i;a++){
                 System.out.print(algorithm(a)+" \t");
           }
          System.out.println("");
        }  
        return k ;
    }
}
