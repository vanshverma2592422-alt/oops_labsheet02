package labsheet02;

public class Question18FibonacciFirstTwenty {
    public void printSequence() {
        long first = 0;
        long second = 1;
        for (int term = 1; term <= 20; term++) {
            System.out.print(first + (term == 20 ? "\n" : " "));
            long next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        new Question18FibonacciFirstTwenty().printSequence();
    }
}