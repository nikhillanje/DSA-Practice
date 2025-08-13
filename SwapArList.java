import java.util.*;

public class SwapArList {

    public static void swapArList(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);

        list.set(idx1, list.get(idx2));

        list.set(idx2, temp);
    }

    public static void main(String[] args) {

        // Swap logic
        // int temp , a = 5, b = 6 ;
        // temp = a;
        // a = b ;
        // b = temp ;

        // Synatx
        ArrayList<Integer> list = new ArrayList<>();
        int idx1 = 1;
        int idx2 = 3;

        list.add(5);
        list.add(6); // 1
        list.add(56);
        list.add(78); // 3
        list.add(90);

        // Before Swapped
        System.out.println(list);

        // calling method
        swapArList(list, idx1, idx2);

        // After Swapped
        System.out.println(list);

    }
}
