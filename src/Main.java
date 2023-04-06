import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        System.out.println(Util.power(a, n));
    }
}
class Util{
    /*
    @power - function that takes two values [a - number], [n - power] and returns a^n. Return multiplies itself every recursion(n - 1) and end at base condition of n == 0.
    @a - number that will be added power.
    @n - power that will be graded for number.
    @return - every return statement multiplies number by itself until condition n == 0 meets. Recursion progresses by subtracting n(n - 1).
     */
    static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        return a * power(a, n - 1);
    }
}