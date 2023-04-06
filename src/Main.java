import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Util.Numeral(num));
    }
}
class Util{
    /*
    @Numeral - recursive function which takes an integer and returns its numeral value multiplying it by (n - 1) every recursion cycle.
Have a base condition of n == 1 to stop cycle. Example: 5 * 4 * 3 * 2 * 1
    @n - number which will be considered numeral.
    @return - returns n * Numeral(n - 1) every cycle until [n == 1]. Which will return 1 ending cycle.
     */
    static int Numeral(int n){
        if(n == 1){
            return 1;
        }
        return (n * Numeral(n - 1));
    }
}