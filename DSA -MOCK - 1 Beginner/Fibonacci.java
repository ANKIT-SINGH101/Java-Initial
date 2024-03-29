public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
