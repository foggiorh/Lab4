import java.util.Arrays;
import java.util.InputMismatchException;
import java.lang.NullPointerException;

public class Lab4{
    public static void main(String[] args){
        int[] test1 = {3,7,2,6,10};
        int[] test2 = null;
        int[] test3 = {10, 25, 0, 2, 100};
        int[] test4 = {40, 5000, 32, 250, 250};
        int[] test5 = new int[5];

        System.out.println("Test 1:");
        System.out.println("Input: " + Arrays.toString(test1));
        System.out.println("Expected output: {10, 7, 6, 3, 2}");
        System.out.println("Actual Output: " + Arrays.toString(sort(test1)));

        System.out.println("Test 3:");
        System.out.println("Input: " + Arrays.toString(test3));
        System.out.println("Expected output: {100, 25, 10, 2, 0}");
        System.out.println("Actual Output: " + Arrays.toString(sort(test3)));

        System.out.println("Test 4");
        System.out.println("Input: " + Arrays.toString(test4));
        System.out.println("Expected output: {10, 7, 6, 3, 2}");
        System.out.println("Actual Output: " + Arrays.toString(sort(test4)));

        System.out.println("Test 5");
        System.out.println("Input: " + Arrays.toString(test5));
        System.out.println("Expected output: {10, 7, 6, 3, 2}");
        System.out.println("Actual Output: " + Arrays.toString(sort(test5)));

        System.out.println("Test 2:");
        System.out.println("Input: " + Arrays.toString(test2));
        System.out.println("Expected output: NullPointerException");
        System.out.println("Actual Output: " + Arrays.toString(sort(test2)));

    }
    
    public static int[] sort(int[] input){
        int[] result = new int[input.length];
        try{
            if(input.length == 0){throw new InputMismatchException("Cannot sort an empty string");}
            
            result = Arrays.copyOf(input, input.length);

            for(int i = 0; i <result.length; i++){
                for(int k = i+1; k<result.length; k++){
                    if(result[i] < result[k]){
                        int temp = result[k];
                        result[k] = result[i];
                        result[i] = temp;
                    }
                }
            }
            
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        return result;
    }
}