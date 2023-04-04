import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Util.sol(num);
    }
}
class Util {
    public static void sol(int n) {
        if (n == 0) {
            return;
        }
        String num = Singleton.getScanner().next();
        sol(n - 1);
        System.out.print(num + " ");
    }
}

class Singleton {
    private static Scanner scanner;
    private Singleton() {}

    public static synchronized Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
