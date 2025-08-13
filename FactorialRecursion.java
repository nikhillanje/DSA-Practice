public class FactorialRecursion {
    public static int printfact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        int fact = printfact(num - 1);
        int ans = fact * num;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = printfact(n);
        System.out.println(ans);

    }
}
