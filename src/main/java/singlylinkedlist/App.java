package singlylinkedlist;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(50);
        myList.insertFirst(40);
        myList.insertLast(999999);
        myList.displayList();
    }
}
