package labsheet02;

import java.util.Scanner;

public class Question14XorSwap {
    public void swap(int first, int second) {
        System.out.println("Before swap: first=" + first + ", second=" + second);
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After swap: first=" + first + ", second=" + second);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two integers: ");
            new Question14XorSwap().swap(input.nextInt(), input.nextInt());
        }
    }
}