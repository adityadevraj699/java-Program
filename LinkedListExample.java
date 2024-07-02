import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        
        List<String> linkedList = new LinkedList<>();

        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        
        System.out.println("Original LinkedList: " + linkedList);
        printNodeAddresses(linkedList);

        
        linkedList.add(0, "Apricot");
        System.out.println("After inserting Apricot at the start: " + linkedList);
        printNodeAddresses(linkedList);

        
        linkedList.add("Fig");
        System.out.println("After inserting Fig at the end: " + linkedList);
        printNodeAddresses(linkedList);

        
        linkedList.add(2, "Blueberry");
        System.out.println("After inserting Blueberry at index 2: " + linkedList);
        printNodeAddresses(linkedList);

        
        System.out.println("Element at index 3: " + linkedList.get(3));

        
        linkedList.set(3, "Blackberry");
        System.out.println("After updating element at index 3 to Blackberry: " + linkedList);
        printNodeAddresses(linkedList);

        
        linkedList.remove(0);
        System.out.println("After removing element at the start: " + linkedList);
        printNodeAddresses(linkedList);

        
        linkedList.remove(linkedList.size() - 1);
        System.out.println("After removing element at the end: " + linkedList);
        printNodeAddresses(linkedList);

       
        linkedList.remove(3);
        System.out.println("After removing element at index 3: " + linkedList);
        printNodeAddresses(linkedList);

       
        linkedList.remove("Banana");
        System.out.println("After removing element with value Banana: " + linkedList);
        printNodeAddresses(linkedList);

        
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("LinkedList contains Cherry: " + containsCherry);

       
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);
    }

   
    public static void printNodeAddresses(List<String> list) {
        System.out.println("Addresses of nodes in the LinkedList:");
        for (String element : list) {
            System.out.println(element + " :   " + System.identityHashCode(element));
        }
        System.out.println("\n");
    }
}
