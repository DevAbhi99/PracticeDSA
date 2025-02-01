package dsapractice;

public class QLinkedList {

    // Node class representing a single node in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Points to the front of the queue
    private Node rear;  // Points to the rear of the queue
    private int count;  // Tracks the size of the queue

    // Constructor to initialize an empty queue
    QLinkedList() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    // Add an element to the queue
    void offer(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode; // If the queue is empty, front and rear point to the new node
            rear = newNode;
        } else {
            rear.next = newNode; // Link the new node to the end of the queue
            rear = newNode;      // Update the rear pointer
        }

        count++; // Increment the count of elements in the queue
        System.out.println(data + " offered to the queue");
    }

    // Remove and return the front element of the queue
    void poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int polledData = front.data; // Store the data to display
        front = front.next;         // Move the front pointer to the next node

        if (front == null) { // If the queue becomes empty, reset the rear pointer
            rear = null;
        }

        count--; // Decrement the count of elements in the queue
        System.out.println(polledData + " removed from the queue!");
    }

    // View the front element without removing it
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return count == 0;
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        QLinkedList ql = new QLinkedList();

        ql.offer(1);
        ql.offer(2);
        ql.offer(3);
        ql.offer(4);
        ql.offer(5);

        System.out.println("Peek: " + ql.peek());

        ql.poll();

        System.out.println("Peek after poll: " + ql.peek());

        // Test empty queue
        while (!ql.isEmpty()) {
            ql.poll();
        }

        ql.poll(); // Test poll on empty queue
    }
}
