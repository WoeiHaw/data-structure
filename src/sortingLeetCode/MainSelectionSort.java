package sortingLeetCode;

public class MainSelectionSort {
    public static void main(String[] args) {

//        LinkedList myLinkedList = new LinkedList(4);
//        myLinkedList.append(2);
//        myLinkedList.append(6);
//        myLinkedList.append(5);
//        myLinkedList.append(1);
//        myLinkedList.append(3);
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);
        myLinkedList.append(6);





        System.out.println("Unsorted Linked List:");
        myLinkedList.printList();

        myLinkedList.selectionSort();

        System.out.println("\nSorted Linked List:");
        myLinkedList.printList();
        System.out.println(myLinkedList.getTail().value);



        /*
            EXPECTED OUTPUT:
            ----------------
            Unsorted Linked List:
            4
            2
            6
            5
            1
            3

            Sorted Linked List:
            1
            2
            3
            4
            5
            6

        */

    }

}
