package org.example.titus.learn.LinkedList;

public class AppendLinkedList{

    private Node head;
    private Node tail;
    private int length;

    public AppendLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public void append(int value){
        Node anotherNode = new Node(value);
        // check if the length is zero.
        if (length ==0 ){
            head = anotherNode;
            tail = anotherNode;
        }else {
            tail.next = anotherNode;
            tail =anotherNode;
        }
        length++; // increment the length
    }

    // remove
    public void remove(){
        if (length == 0){
            // there's nothing to remove
        }else if (length==1){
            // reset the length to zero
        }else {
            // remove the last index
        }
    }
    public void printList(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
