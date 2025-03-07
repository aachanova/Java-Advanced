import java.util.Scanner;

public class Ex06_1_RecursiveFibonacci {

    private static long[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memo = new long[n + 1];

        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        memo[0] = 1;
        memo[1] = 1;

        long fibNum = getFibonacci(n);
        System.out.println(fibNum);

    }

    private static long getFibonacci(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
        return memo[n];
    }
}
