package Week1Exercises;
import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        
        
        boolean error;
        do{ // do-while loop so application doesn't terminate on bad input
            error = true;
            try {
                System.out.println("What number would you like to factor?");
                number = Integer.parseInt(scanner.nextLine());
                error = false;
            } catch (NumberFormatException e){ // input was not an int
                System.out.println("error: input is not a number");
            }
        }while(error);
        
        int[] factors = new int[number/2+3]; // array needs to be big enough to check the third index,
        int j = 0;                           // but all numbers only have one factor above number/2, saves memory space
        int factorCount = 0;
        System.out.println("The factors of " + number + " are:");
        for(int i = 1; i <= number; ++i)
            if(number % i == 0){
                System.out.print(i + " ");
                factors[j++] = i;
                ++factorCount;
            }
        System.out.println();
        System.out.println(number + " has " + factorCount + " factors.");
        
        int sum = 0; // sum factors to check if number is perfect
        for(int i = 0; i < factors.length && factors[i] != number; ++i){
            sum += factors[i];
        }
        System.out.println(number + " is " + (sum == number ? "" : "not ") +
                           "a perfect number.");
        
        System.out.println(number + " is " + (number != 1 && factors[2] == 0 ? "" : "not ") +
                           "a prime number."); // number is prime if it only has two factors, exception for 1
    }
}