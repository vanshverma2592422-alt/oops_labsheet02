package labsheet02;

import java.util.Scanner;

public class Question16PowerOfTwoShifts {
    public void calculate(int number, int power) {
        if (power < 0 || power >= Integer.SIZE) {
            System.out.println("Power must be between 0 and 31.");
            return;
        }
        System.out.println("Multiply by 2^" + power + " using left shift: " + (number << power));
        System.out.println("Divide by 2^" + power + " using signed right shift: " + (number >> power));
        System.out.println("Shift operations use 32-bit integer arithmetic and can overflow.");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer and a power from 0 to 31: ");
            new Question16PowerOfTwoShifts().calculate(input.nextInt(), input.nextInt());
        }
    }
}