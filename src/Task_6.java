public class Task_6 {
    /**
  @power - function that takes two values [a - number], [n - power] and returns a^n. Return multiplies itself every recursion(n - 1) and end at base condition of n == 0.
  @param a - number that will be added power.
  @param n - power that will be graded for number.
  @return - every return statement multiplies number by itself until condition n == 0 meets. Recursion progresses by subtracting n(n - 1).
   */
    // This function calculates the value of 'a' raised to the power 'n'
    // using a recursive approach.

    static int Power(int a, int n){

        // Base case: if n is 0, then a^0 is 1.
        if(n == 0){
            return 1;
        }

        // Recursive case: a^n = a * a^(n-1)
        // The function calls itself recursively with n-1 as the new power.
        return a * Power(a, n - 1);
    }

}
