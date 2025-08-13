public class ReverseArray {

    public static void printrev(int arr[]) {

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {

            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            // update pointers
            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 8, 9, 0 };
        printrev(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
}
