import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(100);
        myQueue.insert(100);
        myQueue.insert(100);
        myQueue.insert(100);
        myQueue.view();
    }
}
