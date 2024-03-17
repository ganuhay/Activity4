
package activity4;

import java.util.Scanner;


public class Activity4 {
       
    public static void main(String[] args) {
        Scanner nvm = new Scanner (System.in);
        
        int score;
        System.out.println("Your exam score:");
        score = nvm.nextInt();
        
        if (score >= 70){
        double GPA = 3.5;
            System.out.println("Your GPA is above:" + GPA);
            System.out.println("Congratulations!You are eligible for admission");
        }else if (score <= 70){
        double GPA = 3.0;
            System.out.println("Your GPA is below:" + GPA);
            System.out.println("Sorry, you are not eligible for admission");
            
        }    
        nvm.close();
      }
    }


    
