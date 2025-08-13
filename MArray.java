public class MArray {

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // initilization of @2D Arrays
        // int[][] arr = new int[2][3];

        int[][] arr2 = { { 3, 4 }, { 5, 6, 7 } };
        print2DArray(arr2);

    }
}
