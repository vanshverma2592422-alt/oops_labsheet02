package labsheet02;

import java.util.Scanner;

public class Question13TernaryCharacterType {
    public void classify(char character) {
        String type = Character.isDigit(character) ? "digit"
                : Character.isLetter(character)
                    ? ("aeiouAEIOU".indexOf(character) >= 0 ? "vowel" : "consonant")
                    : "special symbol";
        System.out.println(character + " is a " + type + ".");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter one character: ");
            new Question13TernaryCharacterType().classify(input.next().charAt(0));
        }
    }
}