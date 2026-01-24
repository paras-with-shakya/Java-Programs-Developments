import java.util.ArrayList;

public class PS_70_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);

        l1.add(5);
        l1.add(7);
        l1.add(1);
        l1.add(2);
        l1.add(7);
        l1.add(5, 23);
        l1.add(5, 24);
        l1.addAll(l2);
        // l1.clear();
        // l1.remove(0);
        System.out.println(l1.contains(3));
        // System.out.println((char) l1.indexOf(7));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));
        l1.set(0, 100);
        l1.isEmpty();

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
