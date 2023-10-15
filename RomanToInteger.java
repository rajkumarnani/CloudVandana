// Java 2nd Question : 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value;

            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    value = 0;
            }

            if (value == 0) {
                return -1;
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().trim();
        scanner.close();

        int integerEquivalent = romanToInt(romanNumeral);

        if (integerEquivalent != -1) {
            System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integerEquivalent);
        } else {
            System.out.println("Invalid Roman numeral.");
        }
    }
}
