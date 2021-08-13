package Week1Exercises;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double investment, growth;
        int years, compounds;
        
        System.out.println("How much do you want to invest?");
        investment = Double.parseDouble(scanner.nextLine());
        System.out.println("How many years are you investing?");
        years = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the annual interest rate % growth?");
        growth = Double.parseDouble(scanner.nextLine()) / 100;
        do{
            System.out.println("What is your growth period?");
            System.out.println("1- Daily");
            System.out.println("2- Monthly");
            System.out.println("3- Quarterly");
            switch(Integer.parseInt(scanner.nextLine())){
                case(1):
                    compounds = 365;
                    break;
                case(2):
                    compounds = 12;
                    break;
                case(3):
                    compounds = 4;
                    break;
                default:
                    compounds = 0;
                    System.out.println("Invalid Selection");
            }
        } while (compounds == 0);
        System.out.println();
        
        double current;
        System.out.println("Calculating...");
        for(int i = 1; i <= years; ++i){
            System.out.println("Year " + i + ":");
            System.out.printf("Began with $%.2f\n", investment);
            
            current = investment;
            for(int j = 0; j < compounds; ++j){
                current += current * growth/compounds;
            }
            
            System.out.printf("Earned $%.2f\n", current - investment);
            investment = current;
            System.out.printf("Ended with $%.2f\n", investment);
            System.out.println();
        }
    }
}