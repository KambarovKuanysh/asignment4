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
**Explanation**: Program takes integer as an input and iterates through every number until the inputted adding them into [HashSet<Integer> set], later iterating this set and checking if it has a true divisor. Program starts iterating with [2], because it's the first prime number.<br />
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
