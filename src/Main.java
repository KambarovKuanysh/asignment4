import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Util.fibonacci(num));
    }
}
class Util{
    /*
    @fibonacci - function that return [n] element of fibonacci cycle. Function uses basic formula of fibonacci member. F(2n) = F(1n) + F(0n).
every fibonacci member is compounded from "ones" which is first and second fibonacci member. Program disassemble every number into primal "ones".
Example: 1 + 1 + 1 + 1 + 1 = 2 + 3.
    @n - order of number that will be searched in fibonacci cycle.
    @return - uses formula of fibonacci number( F(2n) = F(1n) + F(0n) ) to recursively disassemble numbers and ends at a base condition of first
or second fibonacci member(1,1).
     */
    static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}