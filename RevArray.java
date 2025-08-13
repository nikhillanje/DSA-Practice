public class RevArray {

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {

            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // move pointers
            first++;
            last--;

        }

    }

    public static void main(String[] args) {

        int numbers[] = { 34, 56, 78, 90, 54, 23, 1234 };

        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i] + " ");

        }
        System.out.println();

    }
}
