package labsheet02;

import java.util.Scanner;

public class Question06HalvingSteps {
    public void countSteps(double number) {
        if (!Double.isFinite(number) || number < 0) {
            System.out.println("Enter a finite, non-negative number.");
            return;
        }
        int steps = 0;
        while (number >= 1) {
            number /= 2;
            steps++;
        }
        System.out.println("Steps: " + steps);
        System.out.println("Final value: " + number);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a non-negative number: ");
            new Question06HalvingSteps().countSteps(input.nextDouble());
        }
    }
}