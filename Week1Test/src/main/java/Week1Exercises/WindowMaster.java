package Week1Exercises;
import java.util.Scanner;

public class WindowMaster {
    public static void main(String [] args) {
        // declare variables for height and width
        int windows;
        float height;
        float width;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;
        String stringGlassCost;
        String stringTrimCost;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float glassCost;
        float trimCost;
        
        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        try{
            System.out.println("Please enter number of windows:");
            windows = Integer.parseInt(myScanner.nextLine());
            System.out.println("Please enter window height:");
            stringHeight = myScanner.nextLine();
            System.out.println("Please enter window width:");
            stringWidth = myScanner.nextLine();

            System.out.println("Please enter cost of glass:");
            stringGlassCost = myScanner.nextLine();
            System.out.println("Please enter cost of trim:");
            stringTrimCost = myScanner.nextLine();

            // convert String values of height and width to float values
            height = Float.parseFloat(stringHeight);
            width = Float.parseFloat(stringWidth);
            glassCost = Float.parseFloat(stringGlassCost);
            trimCost = Float.parseFloat(stringTrimCost);
        } catch (Exception e){
            System.out.println("Unable to parse user input.");
            return;
        }
        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = windows * ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
        
        return;
    }
}
