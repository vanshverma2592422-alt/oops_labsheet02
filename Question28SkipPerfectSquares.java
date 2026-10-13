package labsheet02;

public class Question28SkipPerfectSquares {
    public void printNumbers() {
        for (int number = 1; number <= 50; number++) {
            int root = (int) Math.sqrt(number);
            if (root * root == number) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Question28SkipPerfectSquares().printNumbers();
    }
}