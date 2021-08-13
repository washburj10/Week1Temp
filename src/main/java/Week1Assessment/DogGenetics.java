package Week1Assessment;
import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] breeds = {"King Doberman", "Common Cur", "Dramatic RedNosed Asian Pug",
                           "Chihuahua", "St. Bernard"};

        System.out.println("What is your dog's name?");
        String name = scanner.nextLine(); // get name from user
        System.out.println("Well then, I have this highly reliable report on "
                           + name + "'s prestigious background right here.\n");
        System.out.println(name + " is:\n");
        
        int temp, sum = 0; // used to record percentage and percentages so far
        for(int i = breeds.length - 1; i > 0; --i){ // decrement makes it easier to sum to 100%
            temp = random.nextInt(101 - (i + 1) - sum) + 1; // leave at least 1% for each remaining breed, % must be >0
            sum += temp;
            System.out.println(temp + "% " + breeds[i]);
        }
        System.out.println((100 - sum) + "% " + breeds[0]); // ensures last breed makes breeds sum to 100%
        
        System.out.println("\nWow, that's QUITE the dog!");
    }
}