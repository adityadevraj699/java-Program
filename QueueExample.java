import java.util.LinkedList;
import java.util.List;

public class QueueExample {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new Queue<>();

        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

       
        System.out.println("Queue: " + queue);

      
        System.out.println("Peek: " + queue.peek());

       
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

       
        System.out.println("Queue after dequeuing: " + queue);

        
        System.out.println("Is the queue empty? " + queue.isEmpty());

       
        System.out.println("Size of the queue: " + queue.size());

        
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}

class Queue<T> {
    private List<T> list = new LinkedList<>();

   
    public void enqueue(T element) {
        list.add(element);
    }

   
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.remove(0);
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.get(0);
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
