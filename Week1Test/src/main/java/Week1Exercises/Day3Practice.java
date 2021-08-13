package Week1Exercises;
import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice = 5;
        
        do{
            System.out.println("+++++++++++++++++\nGame Menu \n+++++++++++++++++");
            System.out.println("1- New Game");
            System.out.println("2- Settings");
            System.out.println("3- One Player");
            System.out.println("4- Two Players");
            System.out.println("5- Exit");
            System.out.println("Please enter your choice:");

            /*
            Scanner in = new Scanner(System.in);
            choice = Integer.parseInt(in.nextLine());

            if(choice == 1)
                System.out.println("1- New Game");
            else if(ichoice == 2)
                System.out.println("2- Settings");
            else if(choice == 3)
                System.out.println("3- One Player");
            else if(choice == 4)
                System.out.println("4- Two Players");
            else if(choice == 5)
                System.out.println("5- Exit");
            else
                System.out.println("Invalid Selection");
            //*/

            //*
            
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1- New Game");
                    for(int i = 0; i < 10; ++i)
                        System.out.println("Loading game: " + ("=".repeat(i)));
                    break;
                case 2:
                    System.out.println("2- Settings");
                    break;
                case 3:
                    System.out.println("3- One Player");
                    break;
                case 4:
                    System.out.println("4- Two Players");
                    break;
                case 5:
                    System.out.println("5- Exit");
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            
            }
        } while (choice != 5);
        //*/
    }
}