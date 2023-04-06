import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Util.getMin(arr));
    }
}
class Util{
    /*
    @getMin - function takes an array and finds it's minimum by iterating through every member of array and comparing them.
    @arr - input array which will be searched for minimum value.
    @return - return returns minimum integer value of the **arr**.
     */
    static int getMin(int[] arr){
        int min = MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}