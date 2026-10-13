package labsheet02;

import java.util.Scanner;

public class Question21FactorsDoWhile {
    public void printFactors(int number) {
        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }
        int divisor = 1;
        do {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        } while (divisor <= number);
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            new Question21FactorsDoWhile().printFactors(input.nextInt());
        }
    }
}