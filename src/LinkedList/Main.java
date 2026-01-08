package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinedList myLinkedList = new LinedList(2);

        myLinkedList.append(3);
        myLinkedList.prepend(1);

        myLinkedList.printList();

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());
    }
}
