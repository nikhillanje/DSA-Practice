import java.util.Scanner;

public class MArrayUserinput {

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        System.out.println("Enetr the Size of an Array R and C");
        size1 = sc.nextInt();
        size2 = sc.nextInt();
        int[][] arr = new int[size1][size2];

        System.out.println("Enter the Elements ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        print2DArray(arr);

    }
}
