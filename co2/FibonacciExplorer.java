class FibonacciExplorer {
    static int callCount = 0;

    static int fibonacci(int n) {
        callCount++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\nTotal recursive calls: " + callCount);
    }
}
