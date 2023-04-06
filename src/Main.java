import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Util.reverseArray(num);
    }
}
class Util {

    /*
    @reverseArray - this method takes integer as an array length input and read array from console recursively making nested loops which on end will activate
loops started before initializing "sout" values that stored read variables. Method uses singleton pattern for not re-initializing scanner and not lost read from console.
    @n - length of array that will be inputted.
    @return - program has a return statement just to end the cycle when input ends.
     */
    public static void reverseArray(int n) {
        if (n == 0) {
            return;
        }
        String num = Singleton.getScanner().next();
        reverseArray(n - 1);
        System.out.print(num + " ");
    }
}

class Singleton {
    private static Scanner scanner;
    private Singleton() {}
    /*
    This pattern was implemented due lost of data when re-initializing scanner. By this way we can make sure that scanner always will be the same.
     */

    public static synchronized Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}