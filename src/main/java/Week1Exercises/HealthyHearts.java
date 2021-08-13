package Week1Exercises;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age, MHR;
        
        System.out.println("What is your age?");
        age = input.nextInt();
        MHR = 220 - age;
        
        System.out.println("Your maximum heart rate should be " + MHR
                           + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(MHR * .5)
                           + " - " + Math.round(MHR * .85) + " beats per minute.");
    }
}