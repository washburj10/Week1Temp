package Week1Exercises;
import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice;
        
        String[] stoneName = {"Garnet", "Amethyst", "Aquamarine", "Diamond",
                              "Emerald", "Pearl", "Ruby", "Peridot",
                               "Sapphire", "Opal", "Topaz", "Turqouise"};
        
        String[] monthName = {"January", "February", "March", "April",
                              "May", "June", "July", "August",
                              "September", "October", "November", "Decemeber"};
        
        System.out.println("What month's birthstone do you want to know?");
        choice = Integer.parseInt(in.nextLine());
        
        if(choice <= 0 || choice > 12){
            System.out.println("I think you must be confused, " + choice +
                               " doesn't match a month.");
        } else {
            System.out.println(monthName[choice - 1] + "'s birthstone is " +
                               stoneName[choice - 1] + ".");
        }
    }
}
