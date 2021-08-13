package Week1Exercises;
import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int goal = 0, count = 0;
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        goal = Integer.parseInt(in.nextLine());
        
        for(int i = 0; count < goal; ++i){
            if(i > 0){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("fizz buzz");
                    count += 1;
                } else if(i % 3 == 0){
                    System.out.println("fizz");
                    ++count;
                } else if(i % 5 == 0){
                    System.out.println("buzz");
                    ++count;
                } else
                    System.out.println(i);
            } else
                System.out.println(i);
        }
        
        System.out.println("TRADITION!!!!!");
    }
}