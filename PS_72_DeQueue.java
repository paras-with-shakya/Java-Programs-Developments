
import java.util.ArrayDeque;

public class PS_72_DeQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(30);
        deque.addFirst(10);
        deque.addLast(20);  
        deque.addFirst(5);
        deque.addLast(25);
        System.out.println("Deque after additions: " + deque);
        deque.removeFirst();
        System.out.println("Deque after removing first: " + deque); 
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());    
    }
}
