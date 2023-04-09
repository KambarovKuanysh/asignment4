public class Task_10 {
    /**
     * @findGCD - method takes two integers 'a' and 'b' as input and uses the Euclidean algorithm
     * to find their greatest common divisor (GCD) recursively.
     * @param a - first number.
     * @param b - second number.
     * @return - the GCD of 'a' and 'b'.
     */
    public static int findGCD(int a, int b) {

        // Base case: if 'a' is divisible by 'b', then 'b' is the GCD.
        if(a % b == 0){
            return b;
        }

        // Recursive case:
        // Use the Euclidean algorithm to find the GCD of 'b' and the remainder of 'a' divided by 'b'.
        // The function calls itself recursively with 'b' as the new 'a' and 'a % b' as the new 'b'.
        return findGCD(b, a%b);
    }

}
