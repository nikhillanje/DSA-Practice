import java.util.*;

public class ReverseAeList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(67);
        list.add(90);
        list.add(12);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
