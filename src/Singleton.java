import java.util.Scanner;

/**
 * This class represents a Singleton pattern that ensures only one instance of Scanner object
 * is created and used throughout the program to avoid data loss while re-initializing scanner.
 */
class Singleton {
    // Private static variable to hold the instance of the Scanner object.
    private static Scanner scanner;

    // Private constructor to prevent external instantiation of the Singleton class.
    private Singleton() {}

    /**
     * This method provides a synchronized access to the Scanner object instance.
     * If the Scanner object has not been created yet, a new instance is created.
     * @return - the instance of the Scanner object.
     */
    public static synchronized Scanner getScanner() {
        // If the Scanner object has not been created yet, create a new instance.
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        // Return the instance of the Scanner object.
        return scanner;
    }
}

