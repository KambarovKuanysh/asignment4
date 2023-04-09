public class Task_3 {
    /**
   @IsPrime - method takes a number and checks it for primeness using basic mathematical principles -> Number's greatest non-reminder divider its own sqrt.
   @num - the number that's going to be checked for Primeness.
   @return - functions returns boolean answer if number prime or composite
    */
    static boolean isPrime(int num) {
        //Excluding range of numbers that can not be prime(-infinity; 2)
        if (num < 2) {
            return false;
        }
        //Iterating through every number until the checked ones sqrt. Using -> number's greatest non-reminder divider its own sqrt
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                //if number will divide with no reminder return false
                return false;
            }
        }
        //If program did not face any issues return true. Number is prime.
        return true;
    }
}
