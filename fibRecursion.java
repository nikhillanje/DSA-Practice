public class fibRecursion {

    public static void printFib(int a, int b, int n) {
        // Base Case
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);

    }

    public static void main(String[] args) {

        // first print Default Numbers...
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        // Declear Fib number including Default numbers
        int n = 10;
        printFib(a, b, n - 2);

    }
}
