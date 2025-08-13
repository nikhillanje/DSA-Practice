public class Recursion1to5 {
    public static void printnum(int n) {
        // Base Case
        if (n == 11) {
            return;
        }
        System.out.println(n);
        printnum(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printnum(n);

    }
}
