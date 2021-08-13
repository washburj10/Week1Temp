package Week1Exercises;

public class WaitAWhile {
    public static void main(String[] args) {

        // changing bedTime to 11 increases the number of loops until timeNow == 11
        // changing timeNow to 11 and bedTime to 10 makes it fail the condition 
        //   and not loop a single time
        // if you comment out timeNow++ but keep the previous change, it never enters the loop
        //   so there is no change. With original values, it will loop indefinitely and timeNow
        //   will not change.
        
        
        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            //timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}