package doublylinkedlist;

public class Main {

    public static void main(String[] args) {
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.append(2);

//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast());
//        myDLL.printList();

        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);
        myDLL.prepend(1);

        System.out.println(myDLL.removeFirst().value);

        System.out.println(myDLL.removeFirst().value);

        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());


    }
}
