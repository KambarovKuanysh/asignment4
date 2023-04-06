import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Util.getMid(arr));
    }
}
class Util{
    /*
    @getMid - function iterates through every member of an array adding it to the **num** variable. After iteration this number will be divided to the number of elements
    in array to find middle value.
    @arr - input array which will be calculated for middle value.
    @num - variable which contains sum of all elements of an array. Later will be used in return to be divided and find middle.
    @return - consists of **num** and length of an array. Returns double value of a middle of array.
     */
    static double getMid(int[] arr){
        double num = 0;
        for(int i = 0 ; i < arr.length; i++){
            num += arr[i];
        }
        return num/arr.length;
    }
}