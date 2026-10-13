package labsheet02;

import java.util.Scanner;

public class Question27GradeMeaning {
    public void describe(char grade) {
        switch (Character.toUpperCase(grade)) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade. Enter a letter from A to F.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter grade (A-F): ");
            new Question27GradeMeaning().describe(input.next().charAt(0));
        }
    }
}