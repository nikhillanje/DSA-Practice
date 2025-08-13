import java.util.*;

public class ArList {
    public static void main(String[] args) {

        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

        // adding elements to list
        list.add(5);
        list.add(6);
        list.add(45);
        list.add(78);

        // printing an list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        int num = list.get(3);

        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.set(2, 56);

        System.out.println(list.contains(500));

        // list.clear();

        list.add(3, null);
        System.out.println(list);

    }
}
