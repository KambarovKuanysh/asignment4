public class Task_2 {
    /**
   @getMid - function iterates through every member of an array adding it to the **num** variable. After iteration this number will be divided to the number of elements
   in array to find middle value.
   @arr - input array which will be calculated for middle value.
   @num - variable which contains sum of all elements of an array. Later will be used in return to be divided and find middle.
   @return - consists of **num** and length of an array. Returns double value of a middle of array.
    */
    static double getMid(int[] arr){
        //Initializing variable that will contain sum of all elements
        double num = 0;
        //Iterating through every member of an array and adding their sum to **num**
        for(int i = 0 ; i < arr.length; i++){
            //addition process
            num += arr[i];
        }
        //Return uses basic formula of (all_value)/(count_of_objects)
        //arr.length function returns count of elements in an array
        return num/arr.length;
    }
}
