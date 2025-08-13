public class SumofNRecursion {
    public static void printSum(int st, int sum, int end) {

        // Base Case
        if (st == end) {
            sum += st;
            System.out.println(sum);
            return;
        }
        sum += st;
        printSum(st + 1, sum, end);
    }

    public static void main(String[] args) {
        printSum(1, 0, 7);
    }
}
