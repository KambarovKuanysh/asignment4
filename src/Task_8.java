public class Task_8 {
    /**
    @checkIfNum - method goes through substring each recursion it has and checks its first character. Check uses ASCII table in range of ("0" - "9")
Example: 123nur -> 23nur -> 3nur -> nur -> false.
    @s - input string that will be checked if it is integer
    @return - potential number will be checked by substring which will be cut at index [1]. Base condition counts on the zero length of string that will be passed.
     */


    public static boolean checkIfNum(String s) {
        // This function takes a string **s** as input and recursively checks if it represents a valid integer.
        // It returns true if **s** is a valid integer, and false otherwise.
        // Base case: if the length of **s** is 0, it represents a valid integer (0).
        if (s.length() == 0) {
            return true;
        }

        // Get the first character of **s**.
        char firstChar = s.charAt(0);

        // Recursive case: if the first character is a digit (0-9),
        // call the function recursively with the remaining substring.
        if (firstChar >= '0' && firstChar <= '9') {
            return checkIfNum(s.substring(1));

            // If the first character is not a digit, **s** does not represent a valid integer.
        } else {
            return false;
        }
    }

}
