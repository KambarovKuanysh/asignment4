
import static java.lang.Integer.MAX_VALUE;

public class Task_1 {
    /**
    @getMin - function takes an array and finds it's minimum by iterating through every member of array and comparing them.
    @arr - input array which will be searched for minimum value.
    @min - value start with the value of the maximum possible integer in integer to be compared later. Contains current minimum value of an array.
    @return - return returns min integer value of the **arr**.
     */
    static int getMin(int[] arr){
        //Initializing maximum value to compare soon
        int min = MAX_VALUE;
        //Iterating through every element of an array and comparing with **min**
        for(int i = 0 ; i < arr.length; i++){
            //If number is less that min. Give that value to min in order to compare next
            if(arr[i] < min){
                min = arr[i];
            }
        }
        //Returning found minimum value
        return min;
    }
}
