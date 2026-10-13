package labsheet02;

import java.util.Scanner;

public class Question09StringLexicographicOrder {
    public void compare(String first, String second) {
        int sharedLength = Math.min(first.length(), second.length());
        int index = 0;
        while (index < sharedLength && first.charAt(index) == second.charAt(index)) {
            index++;
        }
        if (index == sharedLength) {
            if (first.length() < second.length()) {
                System.out.println("First string comes before second string.");
            } else if (first.length() > second.length()) {
                System.out.println("First string comes after second string.");
            } else {
                System.out.println("The strings are equal.");
            }
        } else if (first.charAt(index) < second.charAt(index)) {
            System.out.println("First string comes before second string.");
        } else {
            System.out.println("First string comes after second string.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first word: ");
            String first = input.next();
            System.out.print("Enter the second word: ");
            String second = input.next();
            new Question09StringLexicographicOrder().compare(first, second);
        }
    }
}