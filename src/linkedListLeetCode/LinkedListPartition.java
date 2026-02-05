package linkedListLeetCode;

public class LinkedListPartition {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListPartition(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x){
        if(head == null) return;
        Node dumm1 = new Node(0);
        Node dumm2 = new Node(0);
        Node prev1 = dumm1;
        Node prev2 = dumm2;
        Node current = head;

        while (current != null){
            if(current.value <x){
                prev1.next = new Node(current.value);
                prev1 = prev1.next;


            }else{
                prev2.next =  new Node(current.value);
                prev2 = prev2.next;
            }

            current = current.next;

        }


        prev1.next = dumm2.next;
        head = dumm1.next;



        dumm1.next = null;
        dumm2.next = null;

    }

    // WRITE THE PARTITIONLIST METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
}
