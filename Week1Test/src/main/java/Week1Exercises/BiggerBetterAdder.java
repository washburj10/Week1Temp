package Week1Exercises;
import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.println("Please enter 3 values:");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        
        System.out.println(x + " + " + y + " + " + z + " = " + (x+y+z));
    }
}
