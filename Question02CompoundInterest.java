package labsheet02;
import java.util.Scanner;

public class Question02CompoundInterest {
    public void calculate(double principal, double rate, double years) {
        if (principal < 0 || rate < 0 || years < 0) {
            System.out.println("Principal, rate, and time must not be negative.");
            return;
        }
        double amount = principal * Math.pow(1 + rate / 100.0, years);
        System.out.println("Compound interest: " + (amount - principal));
        System.out.println("Final amount: " + amount);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter principal, annual rate (%), and time (years): ");
            new Question02CompoundInterest().calculate(input.nextDouble(), input.nextDouble(), input.nextDouble());
        }
    }
}