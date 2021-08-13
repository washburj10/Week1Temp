package Week1Exercises;
import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args){
        Random random = new Random();
        int chance = 1;
        boolean dirty = true;
        
        do{
            System.out.print("Clean your room!! ");
            if(chance > 7){
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND" +
                                   " I'M TAKING YOUR XBOX!");
                break;
            } else {
                System.out.println("(x" + chance + ")");
                if(random.nextInt(100) < chance++ * 10){
                    System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO" +
                                       " EAT MY PEAS.");
                    dirty = false;
                }
            }
        } while (dirty);
    }
}