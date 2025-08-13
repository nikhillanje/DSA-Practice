import java.util.ArrayList;

public class SizeOfAL {
    public static void main(String[] args) {

        // Synatx
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(90);
        list.add(80);
        list.add(40);
        list.add(30);

        System.out.println(list);

        System.out.println("Size is " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
