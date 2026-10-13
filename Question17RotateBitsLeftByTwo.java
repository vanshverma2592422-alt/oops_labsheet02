package labsheet02;

import java.util.Scanner;

public class Question17RotateBitsLeftByTwo {
    public void rotate(int number) {
        int rotated = (number << 2) | (number >>> (Integer.SIZE - 2));
        System.out.println("Original: " + number);
        System.out.println("Rotated left by 2 bits: " + rotated);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a 32-bit integer: ");
            new Question17RotateBitsLeftByTwo().rotate(input.nextInt());
        }
    }
}