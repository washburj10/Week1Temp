package Week1Exercises;
import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int miles, hotdogs, languages;
        
        System.out.println("How many miles can you run?");
        miles = Integer.parseInt(input.nextLine());
        System.out.println("That's nothing, I can run " + (miles * 2 + 1) + " miles.");
        
        System.out.println("How many hot dogs can you eat?");
        hotdogs = Integer.parseInt(input.nextLine());
        System.out.println("Well I can eat " + (hotdogs * 2 + 1) + " hot dogs.");
        
        System.out.println("How many languages do you know?");
        languages = Integer.parseInt(input.nextLine());
        System.out.println("I know " + (languages * 2 + 1) + " languages. That's way more.");
    }
}
