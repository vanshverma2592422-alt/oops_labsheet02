package labsheet02;

import java.util.Random;

public class Question29RandomUntilDivisible {
    public void generate() {
        Random random = new Random();
        int number;
        int generated = 0;
        while (true) {
            number = random.nextInt(100) + 1;
            generated++;
            System.out.println("Generated: " + number);
            if (number % 7 == 0 && number % 13 == 0) {
                break;
            }
        }
        System.out.println("Found " + number + " after " + generated + " number(s).");
    }

    public static void main(String[] args) {
        new Question29RandomUntilDivisible().generate();
    }
}