public class Queue {
    private int maxSize; // initializes the set number of slots
    private long[] queueArray; // slots to maintain the data
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[maxSize];
        front = 0; // index position of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize -1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view() {
        System.out.println("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i] + " ");
        }
        System.out.println(" ]");
    }
}
