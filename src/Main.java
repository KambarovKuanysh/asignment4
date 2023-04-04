import java.util.HashSet;
import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Util.num(num));
    }
}
class Util{
    static int num(int n){
       if(n == 1){
           return 1;
       }
       return (n * num(n - 1));
    }
}