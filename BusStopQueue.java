import java.util.Scanner;

public class BusStopQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] groups = new int[n];

        for (int i = 0; i < n; i++) {
            groups[i] = scanner.nextInt();
        }

        // Initialize variables
        int busCount = 0;
        int currentCapacity = 0;

        for (int i = 0; i < n; i++) {
            // If the current group cannot fit in the current bus
            if (currentCapacity + groups[i] > m) {
                busCount++; // Send the current bus
                currentCapacity = 0; // Start with an empty bus
            }

            // Add the current group to the bus
            currentCapacity += groups[i];
        }

        // Account for the last bus if there are remaining people
        if (currentCapacity > 0) {
            busCount++;
        }
        //output4
        System.out.println(busCount);

        scanner.close();
    }
}
