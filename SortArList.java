import java.util.*;

public class SortArList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(780);
        list.add(90);
        list.add(10);
        list.add(2);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

    }
}
