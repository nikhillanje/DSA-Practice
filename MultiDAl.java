import java.util.*;

public class MultiDAl {
    public static void main(String[] args) {

        // Synatx
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.add(4);

        ml.add(l1);
        ml.add(l2);

        for (int i = 0; i < ml.size(); i++) {
            ArrayList<Integer> currList = ml.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");

            }
            System.out.println();
        }

    }
}
