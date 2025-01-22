import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        ArrayList
        ArrayList<Integer> l1 = new ArrayList<>(); //creates an ArrayList object of integer type
        //-----------1. add method---------
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(0,9); //add 9 at index 0
        l1.add(0,32);//this does not replaces the value but inserts it in the ArrayList at index 0
        //printing ArrayList
        //-------------2.size() method for the size of ArrayList--------------
        for(int i = 0; i<l1.size(); i++){
            //--------------3.get() method to access value at specific index-------
            System.out.println("ArrayList 1: "+l1.get(i));
        }

        ArrayList<Integer> l2 = new ArrayList<>(5);//creates ArrayList of capacity 5
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        l2.add(60);
        //--------------4. addAll() method------------------
        l2.addAll(l1);// adds collection l1 in l2 i.e, adds ArrayList l1 in l2
        for(int i =0; i<l2.size();i++){
            System.out.println("ArrayList 2: " + l2.get(i));
        }

//       -------- 4. contains() method------------
        System.out.println(l1.contains(7));
//       ------------- 5. indexOf()--------------
        System.out.println(l1.indexOf(7));
//       -------- 6. set() used to set value of object at given index-----
        System.out.println(l1.set(0,23));
    }
}