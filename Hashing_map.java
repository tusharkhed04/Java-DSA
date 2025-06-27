import java.util.*;

public class Hashing_map {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Insertion

        map.put("India", 150);
        map.put("US", 80);
        map.put("China", 180);
        map.put("UK", 70);

        System.out.println(map);

        // Updation

        map.put("India", 140);
        System.out.println(map);

        // Search

        if(map.containsKey("UK")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Get element from map

        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));

        // Iteration

        for(Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue()+",");
        }
        System.out.println();

        // iteration using set

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+" => "+map.get(key));
        }


        // Remove

        map.remove("China");
        System.out.println(map);
    }
}
