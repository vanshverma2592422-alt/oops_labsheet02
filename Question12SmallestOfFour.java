package labsheet02;

import java.util.Scanner;

public class Question12SmallestOfFour {
    public void findSmallest(int first, int second, int third, int fourth) {
        int smallest = first < second ? first : second;
        smallest = smallest < third ? smallest : third;
        smallest = smallest < fourth ? smallest : fourth;
        System.out.println("Smallest: " + smallest);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter four integers: ");
            new Question12SmallestOfFour().findSmallest(
                    input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        }
    }
}