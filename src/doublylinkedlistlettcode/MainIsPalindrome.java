package doublylinkedlistlettcode;

public class MainIsPalindrome {

    public static void main(String[] args) {
        DoublyLinkedList myList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myList = new DoublyLinkedList(1);
        myList.makeEmpty();
        System.out.println("List: (empty)");
        System.out.println("Expected: true");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 2: Single-node list
        System.out.println("Test 2: Single Node");
        myList = new DoublyLinkedList(10);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: true");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 3: Two nodes (palindrome)
        System.out.println("Test 3: Two Nodes (Palindrome)");
        myList = new DoublyLinkedList(5);
        myList.append(5);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: true");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 4: Two nodes (Non-palindrome)
        System.out.println("Test 4: Two Nodes (Non-Palindrome)");
        myList = new DoublyLinkedList(5);
        myList.append(7);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: false");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 5: Odd-length palindrome (1 <-> 2 <-> 3 <-> 2 <-> 1)
        System.out.println("Test 5: Odd-Length Palindrome");
        myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(2);
        myList.append(1);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: true");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 6: Even-length palindrome (1 <-> 2 <-> 2 <-> 1)
        System.out.println("Test 6: Even-Length Palindrome");
        myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(2);
        myList.append(1);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: true");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 7: Odd-length non-palindrome (1 <-> 2 <-> 3 <-> 4 <-> 1)
        System.out.println("Test 7: Odd-Length Non-Palindrome");
        myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(1);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: false");
        System.out.println("Actual: " + myList.isPalindrome());
        System.out.println();

        // Test 8: Even-length non-palindrome (1 <-> 2 <-> 3 <-> 4)
        System.out.println("Test 8: Even-Length Non-Palindrome");
        myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: false");
        System.out.println("Actual: " + myList.isPalindrome());
    }
}
