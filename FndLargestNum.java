public class FndLargestNum {

    public static int largest = Integer.MIN_VALUE;
    public static int smallest = Integer.MAX_VALUE; // infinity

    public static int getLargest(int number[]) {

        // int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE; // infinity

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }

            // if (smallest > number[i]) {
            // smallest = number[i];
            // }
        }
        return largest;
    }

    public static int getSmallest(int number[]) {

        // int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE; // infinity

        for (int i = 0; i < number.length; i++) {

            // if (largest < number[i]) {
            // largest = number[i];
            // }

            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5, 90 };

        System.out.println("Largest Value is " + getLargest(number));

        System.out.println("Smallest Value is " + getSmallest(number));

    }
}
