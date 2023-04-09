public class Task_7 {
    /**
    @reverseArray - this method takes integer as an array length input and read array from console recursively making nested loops which on end will activate
loops started before initializing "sout" values that stored read variables. Method uses singleton pattern for not re-initializing scanner and not lost read from console.
    @n - length of array that will be inputted.
    @return - program has a return statement just to end the cycle when input ends.
     */


    public static void reverseArray(int n) {
        // This function takes an integer 'n' as input and reads 'n' strings from the user.
        // It then prints the strings in reverse order using a recursive approach.
        // Base case: if n is 0, there are no more strings to read, so return.
        if (n == 0) {
            return;
        }

        // Read the next string from the user.
        String num = Singleton.getScanner().next();

        // Recursive case: print the strings in reverse order.
        // The function calls itself recursively with n-1 as the new input.
        reverseArray(n - 1);

        // Print the current string, followed by a space.
        System.out.print(num + " ");
    }

}
