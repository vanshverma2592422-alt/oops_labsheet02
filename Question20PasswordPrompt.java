package labsheet02;

import java.util.Scanner;

public class Question20PasswordPrompt {
    private static final String CORRECT_PASSWORD = "java123";

    public void prompt(Scanner input) {
        String password;
        do {
            System.out.print("Enter password: ");
            password = input.nextLine();
        } while (!CORRECT_PASSWORD.equals(password));
        System.out.println("Correct password. Access granted.");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            new Question20PasswordPrompt().prompt(input);
        }
    }
}