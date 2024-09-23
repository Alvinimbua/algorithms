package org.example.titus.learn.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length; // to keep track of the linked list length

    public LinkedList(int value) {
        // Create a new node with the specified
        // value. This node will serve as the first
        // node in our linked list.
        // The 'value' parameter holds the data
        // that the user wants to store in the node.
        // The 'newNode' variable is of type 'Node',
        // which is a nested class inside our
        // LinkedList class, representing the
        // elements of our linked list.
        Node newNode = new Node(value);

        // Set the 'head' of the linked list to point
        // to the newly created node.
        // The 'head' variable is a reference to the
        // first node in the list. Since this is the
        // first and only node at the moment of
        // creation, 'head' points to 'newNode'.
        head = newNode;

        // Set the 'tail' of the linked list to point
        // to the newly created node as well.
        // The 'tail' variable is a reference to the
        // last node in the list. For a new list with
        // a single node, this new node is both the
        // head and the tail, hence 'tail' also points
        // to 'newNode'.
        tail = newNode;

        // Initialize the 'length' of the linked list
        // to 1.
        // The 'length' variable keeps track of the
        // total number of nodes in the list. Since
        // we've just added our first node, the length
        // is set to 1. This helps in quickly knowing
        // the size of our linked list without needing
        // to iterate through it.
        length = 1;
    }


    public void printList(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }
    public void getLength(){
        System.out.println("Length: " + length);
    }
}
