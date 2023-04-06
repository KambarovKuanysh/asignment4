import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(Util.countBinaryCombo(k,n));
    }
}
class Util {
    /*
    @countBinaryCombo - method counts possible binary combination and uses 2 fundamental formulas. Cnk=Cn−1k−1+Cn−1k where Cn0=Cnn=1. Every binary combination can be
disassembled to "ones". That's what this method does. It primarises counting.
    @k - integer value for counts of pick.
    @n - possible variants.
    @return - program uses given formula to disassemble. It will continue returning formula until it will meet base condition Cn0=Cnn=1 and then add it to return integer sum.
     */
    public static int countBinaryCombo(int k, int n) {
        if(k == 0 || k == n){
            return 1;
        }
        else {
            return countBinaryCombo(k - 1, n - 1) + countBinaryCombo(k , n - 1);
        }
    }
}