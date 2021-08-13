package Week1Exercises;
import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String noun1, noun2, pnoun1, pnoun2, pnoun3;
        String adj1, adj2;
        String verb, ptverb;
        int no;
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println();
        System.out.println("I need a noun: ");
        noun1 = input.nextLine();
        System.out.println("Now an adjective: ");
        adj1 = input.nextLine();
        System.out.println("Another noun: ");
        noun2 = input.nextLine();
        System.out.println("And a number: ");
        no = Integer.parseInt(input.nextLine());
        System.out.println("Another adjective: ");
        adj2 = input.nextLine();
        System.out.println("A plural noun: ");
        pnoun1 = input.nextLine();
        System.out.println("Another one: ");
        pnoun2 = input.nextLine();
        System.out.println("One more: ");
        pnoun3 = input.nextLine();
        System.out.println("A verb (infinitive form): ");
        verb = input.nextLine();
        System.out.println("Same verb (past participle): ");
        ptverb = input.nextLine();
        
        System.out.println("*** NOW LET'S GET MAD (libs) ***");
        System.out.printf("%s: the %s frontier. These are the voyages of the starship %s. "
               + "It's %d-year mission: to explore strange %s %s, to seek out "
               + "%s %s and %s %s, to boldly %s where no-one has %s before.",
               noun1, adj1, noun2, no, adj2, pnoun1, adj2, pnoun2, adj2, pnoun3,
               verb, ptverb);
    }
}