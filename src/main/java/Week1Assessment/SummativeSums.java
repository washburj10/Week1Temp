package Week1Assessment;

public class SummativeSums {
    public static void main(String[] args){
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 
                       130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        int[][] arrays = { arr1, arr2, arr3 };
        for(int i = 0; i < arrays.length; ++i)
            System.out.println("#" + (i + 1) + " Array Sum: " + sum(arrays[i]));
    }
    
    // HELPER FUNCTIONS
    private static int sum(int[] ints){ // returns the sum of all values in the given int array
        int sum = 0;
        for(int i = 0; i < ints.length; ++i)
            sum += ints[i];
        
        return sum;
    }
}