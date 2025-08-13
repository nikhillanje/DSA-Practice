import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];
        int sum = 0;

        System.out.println("Enter the Elements of 2*3 matrix");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                arr[i][j] = sc.nextInt();

                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
