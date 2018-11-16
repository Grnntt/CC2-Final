package multidimensional;

import java.util.Scanner;
        
public class MultiDimensional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    System.out.print("Enter the number of rows: ");
    int row = input.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = input.nextInt();

    int [][]nums = new int[row][columns];

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < columns; j++)
        {
            System.out.print("Column " + (j) + " in row " +(i)+ ": ");
            nums[i][j] = input.nextInt();
        }
         System.out.println(" ");
            
    }
        System.out.println("");
        System.out.println("Elements");
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
               System.out.print(nums[i][j]+"\t");
            }
            System.out.println(" ");
        }
        


}
    }

   


