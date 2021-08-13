package Week1Assessment;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String replay = "";
        int maxRounds;
        
        do { // do-while loop allows game to replayed until user quits
            System.out.println("How many rounds of Rock, Paper Scissors do you want to play?");
            maxRounds = Integer.parseInt(scanner.nextLine());

            if(maxRounds < 1 || maxRounds > 10){ // range of playable rounds
                System.out.println("Rounds must be between 1 and 10, inclusive.");
                return;
            }

            int player = 0, com = 0, result = 0; // player/computer choice and result of round
            int rounds = 0, wins = 0, losses = 0, ties = 0; // tally of round results
            Random random = new Random();
            String[] selections = {"rock", "paper", "scissors"};
            
            while(rounds++ < maxRounds){
                System.out.println();
                do{ // do-while loop ensures user selects a valid option
                    System.out.println("ROUND " + rounds);
                    System.out.println("Options:");
                    System.out.println("1- Rock");
                    System.out.println("2- Paper");
                    System.out.println("3- Scissors");

                    player = Integer.parseInt(scanner.nextLine());
                } while (player < 1 || player > 3);

                --player; // decrement option to access selections array 1:1
                com = random.nextInt(3);

                System.out.println("You chose " + selections[player]);
                System.out.println("Computer chooses " + selections[com]);
                result = determineWinner(player, com);
                switch(result){ // function returns -1 on loss, 0 on tie, 1 on win (from player's perspective)
                    case(-1):
                        System.out.println("Computer wins the round!");
                        ++losses;
                        break;
                    case(0):
                        System.out.println("The round ends with a tie.");
                        ++ties;
                        break;
                    case(1):
                        System.out.println("You won the round!");
                        ++wins;
                        break;
                }
            }
            
            System.out.println("=========# RESULTS #=========");
            System.out.println("WINS: " + wins + " | TIES: " + ties + " | LOSSES: " + losses);
            if(wins == losses)
                System.out.println("You tied!");
            else
                System.out.println(wins > losses ? "You won!" : "You lost!");
            
            do{ // ensure player chooses either "Yes" or "No", case sensitive as instructions were explicit with what the user should enter
                System.out.println("Do you want to play again? (Yes/No)");
                replay = scanner.nextLine();
            // change below Strings to change input matched for replaying
            } while(!replay.equals("Yes") && !replay.equals("No"));
        } while (replay.equals("Yes"));
    }
    
    // HELPER FUNCTIONS
    private static int determineWinner(int player, int com){ // returns value representing result of round given choices, see map above (var: String[] selections)
        if(player == com) // result is relative to player's perspective
            return 0; // tie
        if((player == 0 && com == 1) || (player == 1 && com == 2) || (player == 2 && com == 0))
            return -1; // loss
        else
            return 1; // win
        }
}