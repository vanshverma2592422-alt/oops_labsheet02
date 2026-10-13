package labsheet02;
import java.util.Scanner;

public class Question01HeronTriangleArea {
    public void findArea(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0
                || firstSide + secondSide <= thirdSide
                || firstSide + thirdSide <= secondSide
                || secondSide + thirdSide <= firstSide) {
            System.out.println("These side lengths do not form a triangle.");
            return;
        }
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide)
                * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the triangle's three side lengths: ");
            new Question01HeronTriangleArea().findArea(input.nextDouble(), input.nextDouble(), input.nextDouble());
        }
    }
}