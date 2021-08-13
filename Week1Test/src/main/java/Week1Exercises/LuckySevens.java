package Week1Exercises;
import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rolls = 0, cash = 0, max = 0, rollsAtMax = 0;
        int di1, di2;
        
        System.out.println("How many dollars do you have?");
        cash = Integer.parseInt(scanner.nextLine());
        
        while(cash > 0){
            ++rolls;
            di1 = random.nextInt(6) + 1;
            di2 = random.nextInt(6) + 1;
            
            if(di1 + di2 == 7){ // win
                cash += 4;
                if(cash > max){
                    max = cash;
                    rollsAtMax = rolls;
                }
            } else
                --cash;
        }
        
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + rollsAtMax + 
                           " rolls when you had $" + max + ".");
    }
}