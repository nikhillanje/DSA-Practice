import java.util.*;

public class MaxInArList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(100);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        System.out.println(max);

    }
}
