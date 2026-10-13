package labsheet02;

import java.util.Scanner;

public class Question26WeekdayWeekend {
    public void classify(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter a day number from 1 to 7.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter day number (1=Monday, 7=Sunday): ");
            new Question26WeekdayWeekend().classify(input.nextInt());
        }
    }
}