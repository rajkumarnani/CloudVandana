// Jav 3rd Question : Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String input) {
        input = input.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (!input.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check for a pangram: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
