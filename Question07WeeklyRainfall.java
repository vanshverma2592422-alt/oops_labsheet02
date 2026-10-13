package labsheet02;

import java.util.Scanner;

public class Question07WeeklyRainfall {
    public void totalRainfall(double[] rainfall) {
        double total = 0;
        for (double dailyRainfall : rainfall) {
            if (dailyRainfall < 0) {
                System.out.println("Rainfall cannot be negative.");
                return;
            }
            total += dailyRainfall;
        }
        System.out.println("Total rainfall for 7 days: " + total);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] rainfall = new double[7];
            System.out.println("Enter rainfall for each of the 7 days:");
            for (int day = 0; day < rainfall.length; day++) {
                System.out.print("Day " + (day + 1) + ": ");
                rainfall[day] = input.nextDouble();
            }
            new Question07WeeklyRainfall().totalRainfall(rainfall);
        }
    }
}