public class AbsoluteValue {
    public static void main(String[] args) {
        // if number is +ve or 0 -----> Print ass it is
        // id number is -ve ----> remove -Ve sign and print

        int n = 10;

        if (n < 0) {
            n = n + (-2 * n);

        }
        System.out.println(n);
    }
}
