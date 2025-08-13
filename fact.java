public class fact {
    public static int printFact(int n) {

        // base case
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = printFact(n - 1);
        int ans = fact * n;
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = printFact(n);
        System.out.println(ans);
    }

}
