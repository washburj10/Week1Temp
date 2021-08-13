package Week1Exercises;
import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { 
                System.out.println("Your hand was eaten by a grue. You bleed to death");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You are standing in front of a big white house,");
            System.out.println("With a boarded front door.");
            System.out.println("Unboard the door or enter through the window?");
            action = userInput.nextLine();
            
            if(action.equals("unboard the door")){
                System.out.println("You don't know how to pry the board loose.");
                System.out.println("Enter through the window?");
                action = userInput.nextLine();
            } if (action.equals("enter through the window")){
                System.out.println("You enter the building.");
                System.out.println("In all your exertion, you didn't realize how dark the room inside was.");
                System.out.println("You can barely make out the shape of a nearby table.");
                System.out.println("Explore the room further or leave?");
                action = userInput.nextLine();
                if(action.equals("explore the room") || action.equals("explore the room further"))
                    System.out.println("You walk into the hungry jaws of a lurking grue.");
                else if(action.equals("leave")){
                    System.out.println("You exit right back where you came from,");
                    System.out.println("That was probably a good idea.");
                }
            }
        }
    }
}
