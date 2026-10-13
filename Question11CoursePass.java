package labsheet02;

import java.util.Scanner;

public class Question11CoursePass {
    public void check(double theory, double practical, double overall) {
        boolean passes = (theory >= 40 && practical >= 50) || overall >= 50;
        if (passes) {
            System.out.println("Student passes the course.");
        } else {
            System.out.println("Student does not pass the course.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter theory, practical, and overall percentages: ");
            new Question11CoursePass().check(input.nextDouble(), input.nextDouble(), input.nextDouble());
        }
    }
}