public class XpowN {
    public static int printPow(int x, int n) {
        if (n == 0) {
            return 1;

        }
        if (x == 0) {
            return 0;
        }

        int pow = printPow(x, n - 1);
        int ans = x * pow;

        return ans;

    }

    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        int ans = printPow(x, n);
        System.out.println(ans);
    }
}
