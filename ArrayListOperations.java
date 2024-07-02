import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        
        System.out.println("Original ArrayList: " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        
        insertAtStart(arrayList, 5);
        System.out.println("After inserting 5 at the start: " + arrayList);
        

       
        insertAtEnd(arrayList, 60);
        System.out.println("After inserting 60 at the end: " + arrayList);

        
        insertAtIndex(arrayList, 2, 15);
        System.out.println("After inserting 15 at index 2: " + arrayList);

       
        deleteAtStart(arrayList);
        System.out.println("After deleting element at the start: " + arrayList);

       
        deleteAtEnd(arrayList);
        System.out.println("After deleting element at the end: " + arrayList);

        
        deleteAtIndex(arrayList, 3);
        System.out.println("After deleting element at index 3: " + arrayList);

       
        deleteByValue(arrayList, 20);
        System.out.println("After deleting element with value 20: " + arrayList);
    }

    
    public static void insertAtStart(ArrayList<Integer> list, int element) {
        list.add(0, element);
    }

    
    public static void insertAtEnd(ArrayList<Integer> list, int element) {
        list.add(element);
    }

    
    public static void insertAtIndex(ArrayList<Integer> list, int index, int element) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, element);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    
    public static void deleteAtStart(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            list.remove(0);
        } else {
            System.out.println("List is empty");
        }
    }

    
    public static void deleteAtEnd(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            list.remove(list.size()-1);
        } else {
            System.out.println("List is empty");
        }
    }

    
    public static void deleteAtIndex(ArrayList<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    
    public static void deleteByValue(ArrayList<Integer> list, int value) {
        if (list.contains(value)) {
            list.remove(Integer.valueOf(value));
        } else {
            System.out.println("Value not found in list");
        }
    }
}
