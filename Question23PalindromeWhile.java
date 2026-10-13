package labsheet02;

import java.util.Scanner;

public class Question23PalindromeWhile {
    public void check(int number) {
        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
            return;
        }
        int original = number;
        int remaining = number;
        long reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            new Question23PalindromeWhile().check(input.nextInt());
        }
    }
}