import java.util.HashSet;
import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        System.out.println(Util.power(a, n));
    }
}
class Util{
    static int power(int a, int n){
        if(a == 0 & n == 0){
            return 1;
        }
        if(n == 0){
            return 1;
        }
        return a * power(a, n - 1);
    }
}