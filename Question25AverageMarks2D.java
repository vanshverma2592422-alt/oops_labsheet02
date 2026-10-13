package labsheet02;

import java.util.Scanner;

public class Question25AverageMarks2D {
    public void calculateAverages(double[][] marks) {
        if (marks.length == 0) {
            System.out.println("No students were provided.");
            return;
        }
        double grandTotal = 0;
        int totalMarks = 0;
        for (int student = 0; student < marks.length; student++) {
            double studentTotal = 0;
            for (double mark : marks[student]) {
                studentTotal += mark;
                grandTotal += mark;
                totalMarks++;
            }
            if (marks[student].length == 0) {
                System.out.println("Student " + (student + 1) + " has no marks.");
            } else {
                System.out.println("Student " + (student + 1) + " average: "
                        + (studentTotal / marks[student].length));
            }
        }
        if (totalMarks > 0) {
            System.out.println("Overall average: " + (grandTotal / totalMarks));
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of students and subjects: ");
            int students = input.nextInt();
            int subjects = input.nextInt();
            if (students <= 0 || subjects <= 0) {
                System.out.println("Student and subject counts must be positive.");
                return;
            }
            double[][] marks = new double[students][subjects];
            for (int student = 0; student < students; student++) {
                System.out.print("Enter marks for student " + (student + 1) + ": ");
                for (int subject = 0; subject < subjects; subject++) {
                    marks[student][subject] = input.nextDouble();
                }
            }
            new Question25AverageMarks2D().calculateAverages(marks);
        }
    }
}