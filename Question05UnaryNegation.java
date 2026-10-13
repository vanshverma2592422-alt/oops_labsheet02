package labsheet02;

import java.util.Scanner;

public class Question05UnaryNegation {
    public void negate(int number) {
        System.out.println("Negative value: " + (-number));
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            new Question05UnaryNegation().negate(input.nextInt());
        }
    }
}