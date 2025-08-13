public class SearchInArr {

    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 7, 90 };

        int key = 90;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index " + index);
        }

    }
}
