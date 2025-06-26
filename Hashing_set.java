import java.util.HashSet;
import java.util.Iterator;

public class Hashing_set {

    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        

        //Insert
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);

        

        //Serach
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        if(!set.contains(6)) {
            System.out.println("Does not contains 6");
        }

        //Remove
        set.remove(3);
        if(!set.contains(3)) {
            System.out.println("3 is deleted!");
        }

        //Size
        System.out.println("Size of the set:"+set.size());
        System.out.println(set);

        //Iteration -> using iterator()
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}