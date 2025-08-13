import java.util.*;

public class AlPrintTable {
    public static void main(String[] args) {

        // Print Using AL
        // 1 2 3 4 5
        // 2 4 6 8 10
        // 3 6 9 12 15
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            l1.add(i * 1);
            l2.add(i * 2);
            l3.add(i * 3);

        }

        ml.add(l1);
        ml.add(l2);
        ml.add(l3);

        // Printing AL

        for (int i = 0; i < ml.size(); i++) {
            ArrayList<Integer> currList = ml.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
