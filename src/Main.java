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
        System.out.println(Util.mid(arr));
    }
}
class Util{
    static double mid(int[] arr){
        double num = 0;
        for(int i = 0 ; i < arr.length; i++){
            num += arr[i];
        }
        return num/arr.length;
    }
}