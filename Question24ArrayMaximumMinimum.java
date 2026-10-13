package labsheet02;

import java.util.Scanner;

public class Question24ArrayMaximumMinimum {
    public void findExtremes(int[] values) {
        if (values.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        int minimum = values[0];
        int maximum = values[0];
        for (int value : values) {
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many integers? ");
            int size = input.nextInt();
            if (size <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }
            int[] values = new int[size];
            System.out.print("Enter " + size + " integers: ");
            for (int index = 0; index < size; index++) {
                values[index] = input.nextInt();
            }
            new Question24ArrayMaximumMinimum().findExtremes(values);
        }
    }
}