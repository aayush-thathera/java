class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a node at the end
    void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to delete a node by value
    void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If head node holds the key to be deleted
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found in list!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Method to display the linked list
    void displayList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class linkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);

        System.out.println("Linked List after adding elements:");
        list.displayList(); // Output: 10 -> 20 -> 30 -> NULL

        list.deleteNode(20);
        System.out.println("Linked List after deleting 20:");
        list.displayList(); // Output: 10 -> 30 -> NULL

        list.deleteNode(40); // Output: Value not found in list!
    }
}
