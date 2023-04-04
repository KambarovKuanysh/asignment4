import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Util.sol(a,b));
    }
}
class Util {
    public static int sol(int a, int b) {
        if(a % b == 0){
            return b;
        }
        if(a % b == 1){
            return 1;
        }
        return sol(b, a%b);
    }
}
