package Week1Exercises;
import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String unit, planet, volcano, element;
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        unit = input.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        planet = input.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        volcano = input.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        element = input.nextLine();
        
        System.out.println();
        System.out.println("Wow, 1,024 Gigabytes is a " + planet +"!");
        System.out.println("I didn't know the largest ever volcano was discovered on " + element + "!");
        System.out.println("That's amazing that " + volcano + " is the most abundant element in the atmosphere...");
        System.out.println(unit + " is the only planet that rotates clockwise, neat!");
    }
}