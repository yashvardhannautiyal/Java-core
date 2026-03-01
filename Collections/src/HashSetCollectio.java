import java.util.HashSet;

public class HashSetCollectio {
    public static void main(String[] args) {
        System.out.println("HashSet");
        HashSet<Integer> h1 = new HashSet<>(6, 0.5f);
        h1.add(78);
        h1.add(79);
        h1.add(76);
        h1.add(74);
        System.out.println(h1);
    }
}
