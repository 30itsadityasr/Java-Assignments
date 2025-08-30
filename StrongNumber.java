import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

    static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}
