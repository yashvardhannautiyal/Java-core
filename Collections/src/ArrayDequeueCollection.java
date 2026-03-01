import java.util.ArrayDeque;

public class ArrayDequeueCollection {
    public static void main(String[] args) {
        System.out.println("Array Dequeue");
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        //---------------add--------------
        ad1.add(8);
        ad1.add(34);
        ad1.add(48);
        //----------addFirst()----------
        ad1.addFirst(88);
        //---------- getFirst() prints first element------
        System.out.println(ad1.getFirst());
        //--------------- getLast()
        System.out.println(ad1.getLast());
        //----------removeFirst()------------
        System.out.println(ad1.removeFirst());
        //--------------removeLast()---------
        System.out.println(ad1.removeLast());

    }
}
