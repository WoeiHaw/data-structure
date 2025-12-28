package sortingLeetCode;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
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

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
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
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void bubbleSort() {
        if (length < 2) return;
        Node sortedUntil = null;
        Node currentNode = head;
        while (sortedUntil != head.next) {
            if (currentNode.next != sortedUntil && currentNode.value > currentNode.next.value) {
                int temp = currentNode.value;
                currentNode.value = currentNode.next.value;
                currentNode.next.value = temp;
            }
            if (currentNode.next == sortedUntil) {
                sortedUntil = currentNode;
                currentNode = head;
            } else {
                currentNode = currentNode.next;
            }


        }

    }

    public void selectionSort() {
        if (length < 2) return;
        Node current = this.head;
        Node smallest = current;
        Node innerCurrent = current.next;
        while (current.next != null) {
            if (smallest.value > innerCurrent.value) {
                smallest = innerCurrent;
            }
            if (innerCurrent.next != null) {
                innerCurrent = innerCurrent.next;
            } else {
                if (current.value != smallest.value) {
                    int temp = current.value;
                    current.value = smallest.value;
                    smallest.value = temp;
                }


                current = current.next;
                smallest = current;
                innerCurrent = current.next;

            }

        }
    }

    public void insertionSort(){
        if(length < 2) return;
        Node sortedListHead = head;
        Node unsortedListHead = head.next;
        while (sortedListHead.next != null && unsortedListHead != null){
            if( unsortedListHead.value <sortedListHead.value){
                int temp = unsortedListHead.value;
                unsortedListHead.value = sortedListHead.value;
                sortedListHead.value = temp;
            }

            if(sortedListHead.next == unsortedListHead){
                sortedListHead = head;
                unsortedListHead  = unsortedListHead.next;

            }else{
                sortedListHead = sortedListHead.next;
            }
        }


    }

    public void insertionSortV2() {
        if (head == null || head.next == null) return;

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            if (sorted == null || current.value < sorted.value) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.next != null && temp.next.value <= current.value) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }

            current = next;
        }

        head = sorted;
    }

    public void merge(LinkedList otherList){
        Node otherHead = otherList.getHead();
        Node dummy = new Node(0);
        Node current = dummy;
        Node thisHead = this.head;
        length = 0;

       while (otherHead != null && thisHead != null){

           if(otherHead.value < thisHead.value){
               current.next = otherHead;
               otherHead = otherHead.next;
           }else {
               current.next = thisHead;
               thisHead = thisHead.next;
           }
           current = current.next;
           length++;


       }

       while (otherHead != null){
           current.next = otherHead;
           otherHead = otherHead.next;
           current = current.next;
           length++;
       }
       while (thisHead != null){
           current.next = thisHead;
           thisHead = thisHead.next;
           current = current.next;
           length++;
       }

       tail = current;
       head = dummy.next;
//       System.out.println("\n tail's next: " +tail.next);
    }

    public void mergeV2(LinkedList otherList) {
        Node otherHead = otherList.getHead();
        Node dummy = new Node(0);
        Node current = dummy;

        while (head != null && otherHead != null) {
            if (head.value < otherHead.value) {
                current.next = head;
                head = head.next;
            } else {
                current.next = otherHead;
                otherHead = otherHead.next;
            }
            current = current.next;
        }

        if (head != null) {
            current.next = head;
        } else {
            current.next = otherHead;
            tail = otherList.getTail();
        }

        head = dummy.next;
        length += otherList.getLength();
    }



}
