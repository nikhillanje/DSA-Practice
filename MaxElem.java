import java.util.Scanner;

public class MaxElem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        System.out.println("Enter the Elemets Of an Array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int[] row : arr) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }

        System.out.println("Maximum element: " + max);

    }
}
