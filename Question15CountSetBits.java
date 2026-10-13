package labsheet02;

import java.util.Scanner;

public class Question15CountSetBits {
    public void count(int number) {
        int remaining = number;
        int setBits = 0;
        while (remaining != 0) {
            remaining &= remaining - 1;
            setBits++;
        }
        System.out.println("Number of set bits: " + setBits);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            new Question15CountSetBits().count(input.nextInt());
        }
    }
}