package labsheet02;

import java.util.Scanner;

public class Question04VisitorCounter {
    public void simulate(int visitors, int entering, int leaving) {
        if (visitors < 0 || entering < 0 || leaving < 0) {
            System.out.println("Counts must not be negative.");
            return;
        }
        for (int index = 0; index < entering; index++) {
            if (index % 2 == 0) {
                int beforeEntry = visitors++;
                System.out.println("Postfix entry: was " + beforeEntry + ", now " + visitors);
            } else {
                int afterEntry = ++visitors;
                System.out.println("Prefix entry: count is now " + afterEntry);
            }
        }
        for (int index = 0; index < leaving; index++) {
            if (visitors == 0) {
                System.out.println("No visitors remain to leave.");
                break;
            }
            int afterLeaving = --visitors;
            System.out.println("Prefix exit: count is now " + afterLeaving);
        }
        System.out.println("Visitors currently in store: " + visitors);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter current visitors, visitors entering, and visitors leaving: ");
            new Question04VisitorCounter().simulate(input.nextInt(), input.nextInt(), input.nextInt());
        }
    }
}