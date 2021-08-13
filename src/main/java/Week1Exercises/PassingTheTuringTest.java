package Week1Exercises;
import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args){
        String name, color, food;
        int number;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.print("What's your name?\n");
        name = input.nextLine();
        
        System.out.println();
        System.out.println("Hi, " + name + "! I'm Alan.");
        System.out.println("What's your favorite color?");
        color = input.nextLine();
        
        System.out.println();
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        System.out.println();
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.print("What's YOUR favorite fruit, " + name + "?\n");
        food = input.nextLine();
        
        System.out.println();
        System.out.println("Really? " + food + "? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number?\n");
        number = Integer.parseInt(input.nextLine());
        
        System.out.println();
        System.out.println(number + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + number + " * -7 is "
                           + (number * -7) + "? That's a cool number too!");
        
        System.out.println("\n");
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
