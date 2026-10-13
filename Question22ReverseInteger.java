package labsheet02;

import java.util.Scanner;

public class Question22ReverseInteger {
    public void reverse(int number) {
        long remaining = Math.abs((long) number);
        long reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        if (number < 0) {
            reversed = -reversed;
        }
        System.out.println("Reversed number: " + reversed);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            new Question22ReverseInteger().reverse(input.nextInt());
        }
    }
}