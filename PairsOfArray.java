public class PairsOfArray {

    public static void printpairs(int numbers[]) {

        int totalpairs = 0; // For Total Pairs

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {

                System.out.println("(" + curr + "," + numbers[j] + " ) ");
                totalpairs++;
            }

        }

        System.out.println("Total Pairs " + totalpairs);

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10 };
        printpairs(numbers);
    }
}
