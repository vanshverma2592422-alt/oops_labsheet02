package labsheet02;
import java.util.Scanner;

public class Question03DistanceBetweenPoints {
    public void findDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter x1, y1, x2, and y2: ");
            new Question03DistanceBetweenPoints().findDistance(
                    input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        }
    }
}