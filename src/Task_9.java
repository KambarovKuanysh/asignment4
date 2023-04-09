public class Task_9 {
    /**
    @countBinaryCombo - method counts possible binary combination and uses 2 fundamental formulas. Cnk=Cn−1k−1+Cn−1k where Cn0=Cnn=1. Every binary combination can be
disassembled to "ones". That's what this method does. It primarises counting.
    @param k - integer value for counts of pick.
    @param n - possible variants.
    @return - program uses given formula to disassemble. It will continue returning formula until it will meet base condition Cn0=Cnn=1 and then add it to return integer sum.
     */
    public static int countBinaryCombo(int k, int n) {

        // Base case: if k is 0 or n, there is only one possible combination (all 0's or all 1's).
        if(k == 0 || k == n){
            return 1;
        }

        // Recursive case: as in the task "fibonacci", program will disassemble every member to primitives
        // by Cnk=Cn−1k−1+Cn−1k where Cn0=Cnn=1. Then count every facing of formula.
        else {
            return countBinaryCombo(k - 1, n - 1) + countBinaryCombo(k , n - 1);
        }
    }

}
