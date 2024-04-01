import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(85);
//        list.add(98);
//        list.add(72);
//        list.add(16);
//        list.add(200);
//        list.add(264);

//        System.out.println(list.contains(785));
//        System.out.println(list);
//        list.set(0, 99);
//        System.out.println(list);
        Scanner in = new Scanner(System.in);
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        
        // output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here. list[index] syntax will not work here.
        }
    }
}
