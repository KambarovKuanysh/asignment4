# Task1
**Description**: Return the minimum value of an array<br />
**Explanation**: Program takes integer as input to determine lenght of an array and then fulls it. Later method iterates through array and compare minimum value with iterate and checks if it less than it. If it is, minimum value changes to iterate.<br />
**Solution**:
```java
static int Min(int[] arr){
        int min = MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
```
# Task2
**Description**: Return average value of array<br />
**Explanation**: Program takes integer as input to determine lenght of an array and then fulls it. Later method iterates through array adding sum to respected variable. Program returns sum of all numbers divided by count of elements<br />
**Solution**:
```java
 static double mid(int[] arr){
        double num = 0;
        for(int i = 0 ; i < arr.length; i++){
            num += arr[i];
        }
        return num/arr.length;
    }
```
# Task3
**Description**: Check a number for a prime<br />
**Explanation**: Program takes integer as an input and iterates through every number until the inputted adding them into ```HashSet<Integer> set```, later iterating this set and checking if it has a true divisor. Program starts iterating with ```2```, because it's the first prime number.<br />
**Solution**:
```java
static boolean prime(int num){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 2; i <= num; i++){
            if(i != num){
                set.add(i);
            }
            else{
                for(int x : set){
                    if(num % x == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
```
# Task4
**Description**: Return factorial number<br />
**Explanation**: Recursion breaks the loop when ```n == 1```. Returning value return ```n * num(n - 1)``` multiplying it by ```n``` itself every loop and factoring it by one less. <br />
**Solution**:
```java
static int num(int n){
       if(n == 1){
           return 1;
       }
       return (n * num(n - 1));
    }
```
# Task5
**Description**: Return the number on n-th position of fibonacci sequence<br />
**Explanation**: Method have a base condition of ```n <= 2``` because this values corespondents for ```1```(fibonacci member). Every member of fibonacci numbers is compounded from some count of "ones" ```1```. Recursion returns itself until every member is decompounded.  <br />
```Example: 1 + 1 + 1 + 1 + 1 = 2 + 3``` <br />
**Solution**:
```java
static int fibonacci(int n){
       if(n <= 2){
           return 1;
       }
       return fibonacci(n - 1) + fibonacci(n - 2);
    }
```
# Task6
**Description**: Return base in power n<br />
**Explanation**: Base condition is ```n == 0``` which will return 1.  Returning value return ```a * power(a, n - 1)``` multiplying it by ```a``` itself every loop and factoring it by one less. Good to note that ```a^0``` also works correctly. <br />
**Solution**:
```java
static int power(int a, int n){  
        if(n == 0){
            return 1;
        }
        return a * power(a, n - 1);
    }
```
# Task7
**Description**: Reverse an array<br />
**Explanation**: In this solution i used ```Singleton``` pattern in order to avoid multiple initialization of Scanner. Which, when re-initialized, losts its line. Program scans a number and remembers it, when recursion begins. That way we have a construction which will start to "sout" input from console backwards when every number is considered.<br />
**Solution**:
```java
class Util {
    public static void sol(int n) {
        if (n == 0) {
            return;
        }
        String num = Singleton.getScanner().next();
        sol(n - 1);
        System.out.print(num + " ");
    }
}

class Singleton {
    private static Scanner scanner;
    private Singleton() {}

    public static synchronized Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
```
# Task8
**Description**: Check is provided string is integer<br />
**Explanation**: Program takes string and checks its first character for range ```'0' <= firstChar <= '9'```. If it's not, program will return ```false```. By ```substring``` method program later iterates through string like in this example below <br />
```Example: 123NurlanKrasavchik -> 23NurlanKrasavchik -> 3NurlanKrasavchik -> NurlanKrasavchik ``` Program will detect that char is not in range  ```'0' <= firstChar <= '9'``` and return false <br />
**Solution**:
```java
public static boolean sol(String s) {

        if (s.length() == 0) {
            return true;
        }

        char firstChar = s.charAt(0);

        if (firstChar >= '0' && firstChar <= '9') {
            return sol(s.substring(1));

        } else {
            return false;
        }
    }
```
# Task9
**Description**: Return binomial coefficient of n and k params<br />
**Explanation**: This task is alike with the fibonacci one. Every binominal combination can be describes by ```"ones"```. By abusing of conditions ```k=n``` ```k=0``` return ```1```. Program factors it until every member of recursion is decompounded to "ones" returning ```sol(k - 1, n - 1) + sol(k , n - 1)```. <br />
**Solution**:
```java
  public static int sol(int k, int n) {
        if(k == 0 || k == n){
            return 1;
        }
        else {
            return sol(k - 1, n - 1) + sol(k , n - 1);
        }
    }
```
# Task10
**Description**: Return GCD of a and b<br />
**Explanation**: This task uses basic principle of ```Euclidin algorithm```. If a is divisible by b (i.e., a % b == 0), then b is the GCD of a and b. Therefore, the method returns b.
If a is not divisible by b but the remainder of a divided by b is 1 (i.e., a % b == 1), then 1 is the GCD of a and b. Therefore, the method returns 1.
If neither of the above conditions is true, the method recursively calls itself with b as the first parameter and the remainder of a divided by b as the second parameter. <br />
**Solution**:
```java
  public static int sol(int a, int b) {
        if(a % b == 0){
            return b;
        }
        if(a % b == 1){
            return 1;
        }
        return sol(b, a%b);
    }
```
