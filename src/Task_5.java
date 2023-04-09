public class Task_5 {
    /**
    @fibonacci - function that return [n] element of fibonacci cycle. Function uses basic formula of fibonacci member. F(2n) = F(1n) + F(0n).
every fibonacci member is compounded from "ones" which is first and second fibonacci member. Program disassemble every number into primal "ones".
Example: 1 + 1 + 1 + 1 + 1 = 2 + 3.
    @n - order of number that will be searched in fibonacci cycle.
    @return - uses formula of fibonacci number( F(2n) = F(1n) + F(0n) ) to recursively disassemble numbers and ends at a base condition of first
or second fibonacci member(1,1).
     */
    static int fibonacci(int n){
        //Members of fibonacci "one" and "two" contains the same value of 1.
        if(n <= 2){
            return 1;
        }
        //Recursive case: disassembles every member of fibonacci to primitive type using formula F(2n) = F(1n) + F(0n).
        // Example: 1 + 1 + 1 + 1 + 1 = 2 + 3.
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
