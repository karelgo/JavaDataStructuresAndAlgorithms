package DoublyLinkedList;

public class Node {
    int data;
    Node next = null;
    Node previous;

    public void displayNode(){
        System.out.println("{ "+ data + " } ");
    }
}
