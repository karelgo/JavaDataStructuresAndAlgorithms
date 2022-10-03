package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList test = new DoublyLinkedList();
        test.insertFirst(20);
        test.insertFirst(20);
        test.insertFirst(20);
        test.insertFirst(20);
        test.insertLast(40);

        test.displayForward();
    }
}
