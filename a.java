import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String inputString = input.nextLine();
        
        // Check if the input is empty or invalid
        if (inputString.isEmpty()) {
            System.out.println("Input cannot be empty.");
            return;
        }
        
        String result = decodePIN(inputString);
        System.out.println("Decoded PIN: " + result);
    }

    // Method to decode the PIN based on the rules
    public static String decodePIN(String pin) {
        String[] numbers = pin.split(" ");
        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            // Safeguard against empty strings after split
            if (num.trim().isEmpty()) continue;

            try {
                int summedDigit = cumulativeSumToSingleDigit(Integer.parseInt(num));
                result.append(replaceOddWithAlphabet(summedDigit));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + num);
                return "";  // Return an empty string if there's a format error
            }
        }

        return result.toString();
    }

    // Method to calculate the cumulative sum of digits until it becomes a single digit
    public static int cumulativeSumToSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    // Method to replace odd numbers with their corresponding alphabet
    public static String replaceOddWithAlphabet(int digit) {
        if (digit % 2 != 0) {  // odd number
            return Character.toString((char) (96 + digit));  // Convert to alphabet
        } else {
            return Integer.toString(digit);  // Keep even number as it is
        }
    }
}
import java.util.*;

public class PINDecoder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String inputString = input.nextLine();
        
        // Check if the input is empty or invalid
        if (inputString.isEmpty()) {
            System.out.println("Input cannot be empty.");
            return;
        }
        
        String result = decodePIN(inputString);
        System.out.println("Decoded PIN: " + result);
    }

    // Method to decode the PIN based on the rules
    public static String decodePIN(String pin) {
        String[] numbers = pin.split(" ");
        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            // Safeguard against empty strings after split
            if (num.trim().isEmpty()) continue;

            try {
                int summedDigit = cumulativeSumToSingleDigit(Integer.parseInt(num));
                result.append(replaceOddWithAlphabet(summedDigit));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + num);
                return "";  // Return an empty string if there's a format error
            }
        }

        return result.toString();
    }

    // Method to calculate the cumulative sum of digits until it becomes a single digit
    public static int cumulativeSumToSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    // Method to replace odd numbers with their corresponding alphabet
    public static String replaceOddWithAlphabet(int digit) {
        if (digit % 2 != 0) {  // odd number
            return Character.toString((char) (96 + digit));  // Convert to alphabet
        } else {
            return Integer.toString(digit);  // Keep even number as it is
        }
    }
}
