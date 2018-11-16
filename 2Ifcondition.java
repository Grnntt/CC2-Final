
package ifcondition;

import java.util.Scanner;

public class Ifcondition {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("What program/course are you enrolled in?: ");
        String course = in.nextLine();
        
        if(course.equals("BSIT")){
            System.out.println("What major?: ");
            String m = in.nextLine();
                if(m.equals("Netsec")){
                System.out.println("Your course is IT and your major is Network and Security");
            }
            else if (m.equals("WebDev")){
                System.out.println("Your couse is IT and your major is Web Development");
            }
            else if(m.equals("Erp")){
                System.out.println("Your course is IT and your major is Enterprise and Resource Planning");
            }
            

        }
        else if(course.equals("BSCS")){
                System.out.println("What major?:");
                String n = in.nextLine();
            
            if(n.equals("Digital Arts and Animation")){
                System.out.println("Your course is CS and your major is Digital Arts and Animation");
                }    
            else if (n.equals("Mobile Development")){
                System.out.println("Your course is CS and your major is Web Development");
            }

         }
        else if (course.equalsIgnoreCase("BSDA")){
            System.out.println("BSDA");
}
        else {
            System.out.println("Invalid");
        }
    }
    
}
