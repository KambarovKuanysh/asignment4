import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Util.isPrime(n) ? "Prime" : "Composite");
    }
}
class Util{
    /*
    @IsPrime - method takes a number and checks it for primeness using basic mathematical principles -> Number's greatest non-reminder divider its own sqrt.
    @num - the number that's going to be checked for Primeness.
    @return - functions returns boolean answer if number prime or composite
     */
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
