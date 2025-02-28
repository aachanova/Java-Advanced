import java.util.Scanner;

public class Ex06_RecursiveFibonacci {
    public static long[] fibonacciInfo = new long[50];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibonacciInfo[0] = 1;
        fibonacciInfo[1] = 1;
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(Fibonacci(n));
    }

    static long Fibonacci(long n) {
        long currentFibonacci;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibonacciInfo[(int) n] != 0) {
            return fibonacciInfo[(int) n];
        } else {
            currentFibonacci = Fibonacci(n - 1) + Fibonacci(n - 2);
            fibonacciInfo[(int) n] = currentFibonacci;
            return currentFibonacci;
        }
    }
}
