package doublylinkedlistlettcode;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // WRITE ISPALINDROME METHOD HERE //
    //                                //
    //                                //
    //                                //
    //                                //
    ////////////////////////////////////

    public boolean isPalindrome(){
        if(length <=1) return true;
        int middle = length/2;
        Node forward = head;
        Node backward = tail;

        for (int i = 0; i<middle;i++){
            if(backward.value != forward.value) return  false;
            forward = forward.next;
            backward = backward.prev;
        }

        return true;
    }

    public void reverse(){
        if(length<=1) return;
        Node temp = null;
        Node current = head;
        while (current != null){
            current.prev = current.next;
            current.next = temp;
            temp = current;
            current = current.prev;
        }
        tail = head;
        head = temp;
    }

    public void partitionList(int x){
        if (head==null) return;
        Node dumm1 = new Node(0);
        Node dumm2 = new Node(0);

        Node prev1 = dumm1;
        Node prev2 = dumm2;

        Node current = head;

        while (current != null){
            if(current.value<x){
                prev1.next = current;
                current.prev = prev1;
                prev1 = prev1.next;
            }else{
                prev2.next = current;
                current.prev = prev2;
                prev2 = prev2.next;
            }
            current = current.next;
        }

        if(dumm2.next !=null){
            prev1.next = dumm2.next;
            dumm2.next.prev = prev1;
            prev2.next = null;
        }
        head = dumm1.next;
        head.prev = null;


    }

}


