import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(Util.sol(k,n));
    }
}
class Util {
    public static int sol(int k, int n) {
        if(k == 0 || k == n){
            return 1;
        }
        else {
            return sol(k - 1, n - 1) + sol(k , n - 1);
        }
    }
    public static int num(int n){
        if(n == 1){
            return 1;
        }
        return n * num(n - 1);
    }
}
