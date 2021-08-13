package Week1Assessment;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age, maxHeartRate;
        
        System.out.println("What is your age?");
        age = input.nextInt();
        maxHeartRate = 220 - age;
        
        System.out.println("Your maximum heart rate should be " + maxHeartRate
                           + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(maxHeartRate * .5)
                           + " - " + Math.round(maxHeartRate * .85) + " beats per minute.");
    }
}