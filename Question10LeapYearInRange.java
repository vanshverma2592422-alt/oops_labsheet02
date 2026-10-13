package labsheet02;

import java.util.Scanner;

public class Question10LeapYearInRange {
    public void check(int year, int start, int end) {
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        boolean inRange = year >= start && year <= end;
        if (leap && inRange) {
            System.out.println(year + " is a leap year within the given range.");
        } else {
            System.out.println(year + " is not both a leap year and within the given range.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter year, range start, and range end: ");
            new Question10LeapYearInRange().check(input.nextInt(), input.nextInt(), input.nextInt());
        }
    }
}