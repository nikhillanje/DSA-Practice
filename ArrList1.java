import java.util.*;

public class ArrList1 {
    public static void main(String[] args) {

        // Synatx
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(56);
        list.add(45);
        list.add(12);
        System.out.println(list); // print the List [c,v,v,v,f,v,]

        int num = list.get(1); // get the element of an perticular index
        System.out.println(num);

        list.remove(1);
        System.out.println(list);

        list.set(1, 8000);
        System.out.println(list);

        System.out.println(list.contains(8000));

        // list.clear();
        // System.out.println(list);

        list.add(2, 1000);
        System.out.println(list);

    }
}
