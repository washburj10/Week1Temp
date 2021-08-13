package Week1Exercises;
import java.util.Scanner;

public class AllAboutMe {
    public static void main(String[] args){
        String name, food, home;
        int pets;
        boolean whistler;

        name = "Jacob";
        food = "Beef Stroganoff";
        pets = 1;
        home = "apartment";
        whistler = false;
        
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is " + food + ".");
        System.out.println("I have " + pets + " pet" + (pets == 1 ? "" : "s") + ".");
        System.out.println("I live in a " + home + ", and I love it here.");
        System.out.println("It is " + whistler + " that I know how to whistle.");
    }
}
