import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Util.findGCD(a,b));
    }
}
class Util {
    /*
    @findGCD - method that takes two numbers as an input and finds their GCD. Program uses Euclidean algorithm.
    @a - first number.
    @b - second number.
    @return - program continues to returning reminder of divide between a/b and won't stop 'till see base condition of a % b == 0 which can not be escaped.
return will give integer value of GCD.
     */
    public static int findGCD(int a, int b) {
        if(a % b == 0){
            return b;
        }
        return findGCD(b, a%b);
    }
}
