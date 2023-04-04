import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(Util.sol(s));
    }
}
class Util {
    public static boolean sol(String s) {

        if (s.length() == 0) {
            return true;
        }

        char firstChar = s.charAt(0);

        if (firstChar >= '0' && firstChar <= '9') {
            return sol(s.substring(1));

        } else {
            return false;
        }
    }
}
