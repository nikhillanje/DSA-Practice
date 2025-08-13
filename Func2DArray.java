import java.util.Scanner;

public class Func2DArray {
    public static void print2D(int matrix[][], int n, int m) {
        System.out.println("OUTPUT");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[i][j] + " ");
            }

        }

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        print2D(matrix, n, m);

    }
}
