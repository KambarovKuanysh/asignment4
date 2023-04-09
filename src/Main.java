import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = "----------------------------------------";
        String divider = "=======================================";
        // Task 1
        System.out.println("Task 1: getMin. \nTest data: int[5] array = {10, 1, 32, 3, 45}.");
        System.out.println(test);
        int[] min = {10, 1, 32, 3, 45};
        System.out.println("Minimum element: " + Task_1.getMin(min));
        System.out.println(divider);

        // Task 2
        System.out.println("Task 2: getMid. \nTest data: int[4] array = {3, 2, 4, 1}.");
        System.out.println(test);
        int[] mid = {3, 2, 4, 1};
        System.out.println("Middle element: " + Task_2.getMid(mid));
        System.out.println(divider);

        // Task 3
        System.out.println("Task 3: isPrime. \nTest data: 7; 10.");
        System.out.println(test);
        System.out.println("7 is " + (Task_3.isPrime(7) ? "Prime" : "Composite") + ".");
        System.out.println("10 is " + (Task_3.isPrime(10) ? "Prime" : "Composite") + ".");
        System.out.println(divider);

        // Task 4
        System.out.println("Task 4: Numeral. \nTest data: 5.");
        System.out.println(test);
        System.out.println("Numeral for 5: " + Task_4.Numeral(5));
        System.out.println(divider);

        // Task 5
        System.out.println("Task 5: fibonacci. \nTest data: 5, 17.");
        System.out.println(test);
        System.out.println("Fibonacci number at position 5: " + Task_5.fibonacci(5));
        System.out.println("Fibonacci number at position 17: " + Task_5.fibonacci(17));
        System.out.println(divider);

        // Task 6
        System.out.println("Task 6: Power. \nTest data: (2, 10).");
        System.out.println(test);
        System.out.println("2 to the power of 10: " + Task_6.Power(2, 10));
        System.out.println(divider);

        // Task 7
        System.out.println("Task 7: reverseArray. \nTest data: 4, {1, 4, 6, 2}. This task needs user input to function.");
        System.out.println(test);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.print("Enter the elements separated by space: ");
        Task_7.reverseArray(n);
        System.out.println();
        System.out.println(divider);

        // Task 8
        System.out.println("Task 8: checkIfNum. \nTest data: 123456, 123a12.");
        System.out.println(test);
        System.out.println("123456 is " + (Task_8.checkIfNum("123456") ? "a number" : "not a number") + ".");
        System.out.println("123a12 is " + (Task_8.checkIfNum("123a12") ? "a number" : "not a number") + ".");
        System.out.println(divider);

        // Task 9
        System.out.println("Task 9: countBinaryCombo. \nTest data: (2,1); (7,3).");
        System.out.println(test);
        System.out.print(Task_9.countBinaryCombo(1, 2) + " ");
        System.out.println(Task_9.countBinaryCombo(3,7));
        System.out.println(divider);

        //Task 10
        System.out.println("Task 10: findGCD. \nTest data: (32, 48); (10, 7).");
        System.out.println(test);
        System.out.print(Task_10.findGCD(32, 48) + " ");
        System.out.println(Task_10.findGCD(10, 7));
        System.out.println(divider);
    }
}

