package labsheet02;

import java.util.Scanner;

public class Question08ValidTriangleAngles {
    public void check(double first, double second, double third) {
        if (first > 0 && second > 0 && third > 0 && Math.abs(first + second + third - 180.0) < 1e-9) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three angles in degrees: ");
            new Question08ValidTriangleAngles().check(input.nextDouble(), input.nextDouble(), input.nextDouble());
        }
    }
}