package Week1Exercises;
import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int goal = random.nextInt(201) - 100;
        int guess = 0;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        
        do{
            System.out.println("Your guess:");
            try{
                guess = Integer.parseInt(in.nextLine());
                System.out.println();

                if(guess < goal)
                    System.out.println("Ha, nice try - too low! Try again!");
                else if (guess > goal)
                    System.out.println("Ha, nice try - too high! Try again!");
            } catch (NumberFormatException e){
                System.out.println("That's not a number!");
            }
        } while (guess != goal);
        
        System.out.println("Wow, nice guess! That was it!");
    }
}