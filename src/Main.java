import java.util.HashSet;
import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Util.fibonacci(num));
    }
}
class Util{
    static int fibonacci(int n){
       if(n <= 2){
           return 1;
       }
       return fibonacci(n - 1) + fibonacci(n - 2);
    }
}