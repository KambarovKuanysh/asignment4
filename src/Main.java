import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(Util.checkIfNum(s));
    }
}
class Util {
    /*
    @checkIfNum - method goes through substring each recursion it has and checks its first character. Check uses ASCII table in range of ("0" - "9")
Example: 123nur -> 23nur -> 3nur -> nur -> false.
    @s - input string that will be checked if it is integer
    @return - potential number will be checked by substring which will be cut at index [1]. Base condition counts on the zero length of string that will be passed.
     */
    public static boolean checkIfNum(String s) {

        if (s.length() == 0) {
            return true;
        }

        char firstChar = s.charAt(0);

        if (firstChar >= '0' && firstChar <= '9') {
            return checkIfNum(s.substring(1));

        } else {
            return false;
        }
    }
}