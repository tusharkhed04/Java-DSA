import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        

        // Add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get element
        int element = list.get(1);
        System.out.println(element);

        // to add element in between
        list.add(1, 1);
        System.out.println(list);

        // set element 
        list.set(0, 5); // seting 5 at index 0
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        // size of arraylist
        int size = list.size();
        System.out.println(size);

        //arraylist iteration
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();

        //sorting on arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}