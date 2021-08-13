package Week1Exercises;
import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(51) + 50; // will give a value in the range of 50-100
        float num2 = randomizer.nextFloat(); // example: 0.5290411, probably random float between 0 and 1
        boolean num3 = randomizer.nextBoolean(); // example: true, true or false

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        // You can use random numbers in math statements:
        System.out.println((randomizer.nextInt(101) * randomizer.nextInt(101)));
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
    }
}