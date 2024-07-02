import java.util.ArrayList;
import java.util.List;

public class StackExample {

    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();

        
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Mango");

       
        System.out.println("Stack: " + stack);

        
        System.out.println("Peek: " + stack.peek());

        
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        
        System.out.println("Stack after popping: " + stack);

       
        System.out.println("Is the stack empty? " + stack.isEmpty());

        
        System.out.println("Size of the stack: " + stack.size());

       
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}

class Stack<T> {
    private List<T> list = new ArrayList<>();

   
    public void push(T element) {
        list.add(element);
    }

    
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

   
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

   
    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
