import java.util.HashSet;
import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Util.prime(num) ? "Prime" : "Composite");
    }
}
class Util{
    static boolean prime(int num){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 2; i <= num; i++){
            if(i != num){
                set.add(i);
            }
            else{
                for(int x : set){
                    if(num % x == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}