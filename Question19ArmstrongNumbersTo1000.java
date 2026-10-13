package labsheet02;

public class Question19ArmstrongNumbersTo1000 {
    private boolean isArmstrong(int number) {
        int digits = String.valueOf(number).length();
        int remaining = number;
        int sum = 0;
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += (int) Math.pow(digit, digits);
            remaining /= 10;
        }
        return sum == number;
    }

    public void printNumbers() {
        for (int number = 1; number <= 1000; number++) {
            if (isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Question19ArmstrongNumbersTo1000().printNumbers();
    }
}