public class Task_4 {
    /**
   @Numeral - recursive function which takes an integer and returns its numeral value multiplying it by (n - 1) every recursion cycle.
Have a base condition of n == 1 to stop cycle. Example: 5 * 4 * 3 * 2 * 1
   @n - number which will be considered numeral.
   @return - returns n * Numeral(n - 1) every cycle until [n == 1]. Which will return 1 ending cycle.
    */
    static int Numeral(int n){
        //Base condition of [1] to know that recursion should end because every numeral end on [1].
        if(n == 1){
            return 1;
        }
        //Recursive case: Every return multiplies by the number and goes later on cycle.
        //Example: n * (n * (n* Numeral(n - 4))
        return (n * Numeral(n - 1));
    }
}
