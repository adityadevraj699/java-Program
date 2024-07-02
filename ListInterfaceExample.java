import java.util.List;
import java.util.ArrayList;

public class ListInterfaceExample {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        
        System.out.println("Original List: " + list);

        list.add(0, 5);
        System.out.println("After inserting 5 at the start: " + list);

        
        list.add(60);
        System.out.println("After inserting 60 at the end: " + list);

        
        list.add(2, 15);
        System.out.println("After inserting 15 at index 2: " + list);

       
        System.out.println("Element at index 3: " + list.get(3));

        
        list.set(3, 25);
        System.out.println("After updating element at index 3 to 25: " + list);

        
        list.remove(0);
        System.out.println("After removing element at the start: " + list);

        
        list.remove(list.size() - 1);
        System.out.println("After removing element at the end: " + list);

        
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        
        list.remove(Integer.valueOf(20));
        System.out.println("After removing element with value 20: " + list);

        
        boolean contains30 = list.contains(30);
        System.out.println("List contains 30: " + contains30);

       
        int size = list.size();
        System.out.println("Size of the List: " + size);

       
        list.clear();
        System.out.println("After clearing the List: " + list);
    }
}
