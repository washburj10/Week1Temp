package Week1Exercises;
import java.util.Random;

public class BarelyControlledChaos {
    private static final String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};
    private static final String[] animals = {"dog", "cat", "snake", "giraffe", "penguin"};
    private static final Random random = new Random();
    
    public static void main(String[] args){

        String color = randomColor(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColor(); // call color method again here
        int weight = randomInt(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = randomInt(10, 20); // call number method,
            // with a range between 10 - 20
        int number = randomInt(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = randomInt(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    private static String randomColor(){
        int rand = random.nextInt(colors.length);
        return colors[rand];
    }
    private static String randomAnimal(){
        int rand = random.nextInt(animals.length);
        return animals[rand];
    }
    private static int randomInt(int min, int max){
        int rand = random.nextInt(max - min + 1) + min;
        return rand;
    }
}