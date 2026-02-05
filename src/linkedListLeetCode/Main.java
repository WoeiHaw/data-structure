package linkedListLeetCode;

public class Main {

    public static void main(String[] args) {
//        LinkedList myLinkedList = new LinkedList(1);
//
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(1);
//        myLinkedList.append(4);
//        myLinkedList.append(2);
//        myLinkedList.append(5);
//
//
//        myLinkedList.removeDuplicates();
//
//        myLinkedList.printList();

//        LinkedList myLinkedList;

        // Test 1: Empty list
//        System.out.println("Test 1: Empty List");
//        myLinkedList = new LinkedList(1);
//        myLinkedList.makeEmpty();
//        System.out.println("List: (empty)");
//        System.out.println("Expected: 0");
//        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
//        System.out.println();

        // Test 2: Single node (0)
//        System.out.println("Test 2: Single Node (0)");
//        myLinkedList = new LinkedList(0);
//        System.out.print("List: ");
//        myLinkedList.printList();
//        System.out.println("Expected: 0");
//        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
//        System.out.println();

        // Test 3: Single node (1)
//        System.out.println("Test 3: Single Node (1)");
//        myLinkedList = new LinkedList(1);
//        System.out.print("List: ");
//        myLinkedList.printList();
//        System.out.println("Expected: 1");
//        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
//        System.out.println();

        // Test 4: Multi-node (101)
//        System.out.println("Test 4: Multi-Node (101)");
//        myLinkedList = new LinkedList(1);
//        myLinkedList.append(0);
//        myLinkedList.append(1);
//        System.out.print("List: ");
//        myLinkedList.printList();
//        System.out.println("Expected: 5");
//        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
//        System.out.println();

        // Test 5: Multi-node (1111)
//        System.out.println("Test 5: Multi-Node (1111)");
//        myLinkedList = new LinkedList(1);
//        myLinkedList.append(1);
//        myLinkedList.append(1);
//        myLinkedList.append(1);
//        System.out.print("List: ");
//        myLinkedList.printList();
//        System.out.println("Expected: 15");
//        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
//        System.out.println();

        // Test 6: Multi-node (10010)
//        System.out.println("Test 6: Multi-Node (10010)");
//        myLinkedList = new LinkedList(1);
//        myLinkedList.append(0);
//        myLinkedList.append(0);
//        myLinkedList.append(1);
//        myLinkedList.append(0);
//        System.out.print("List: ");
//        myLinkedList.printList();
//        System.out.println("Expected: 18");
//        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
//        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            List: (empty)
            Expected: 0
            Actual: 0

            Test 2: Single Node (0)
            List: 0
            Expected: 0
            Actual: 0

            Test 3: Single Node (1)
            List: 1
            Expected: 1
            Actual: 1

            Test 4: Multi-Node (101)
            List: 1 -> 0 -> 1
            Expected: 5
            Actual: 5

            Test 5: Multi-Node (1111)
            List: 1 -> 1 -> 1 -> 1
            Expected: 15
            Actual: 15

            Test 6: Multi-Node (10010)
            List: 1 -> 0 -> 0 -> 1 -> 0
            Expected: 18
            Actual: 18
        */

        LinkedListPartition myLinkedList;

        // Test 1: Empty list
//        System.out.println("Test 1: Empty List");
//        myLinkedList = new LinkedListPartition(1);
//        myLinkedList.makeEmpty();
//        myLinkedList.partitionList(3);
//        System.out.println("List: (empty)");
//        System.out.println("Expected: empty");
//        myLinkedList.printList();
//        System.out.println();

        // Test 2: Single node (< x)
//        System.out.println("Test 2: Single Node (< x)");
//        myLinkedList = new LinkedListPartition(1);
//        myLinkedList.partitionList(3);
//        System.out.println("List: 1");
//        System.out.println("Expected: 1");
//        myLinkedList.printList();
//        System.out.println();

        // Test 3: Single node (>= x)
//        System.out.println("Test 3: Single Node (>= x)");
//        myLinkedList = new LinkedListPartition(5);
//        myLinkedList.partitionList(3);
//        System.out.println("List: 5");
//        System.out.println("Expected: 5");
//        myLinkedList.printList();
//        System.out.println();

        // Test 4: All nodes < x
//        System.out.println("Test 4: All Nodes < x");
//        myLinkedList = new LinkedListPartition(1);
//        myLinkedList.append(2);
//        myLinkedList.append(0);
//        myLinkedList.partitionList(5);
//        System.out.println("List: 1 -> 2 -> 0");
//        System.out.println("Expected: 1 -> 2 -> 0");
//        myLinkedList.printList();
//        System.out.println();

        // Test 5: All nodes >= x
        System.out.println("Test 5: All Nodes >= x");
        myLinkedList = new LinkedListPartition(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.partitionList(5);
        System.out.println("List: 5 -> 6 -> 7");
        System.out.println("Expected: 5 -> 6 -> 7");
        myLinkedList.printList();
        System.out.println();

        // Test 6: Mixed nodes (< x and >= x)
        System.out.println("Test 6: Mixed Nodes");
        myLinkedList = new LinkedListPartition(3);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.partitionList(5);
        System.out.println("Original List: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1");
        System.out.println("Expected: 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10");
        myLinkedList.printList();
        System.out.println();

        // Test 7: Nodes with duplicates around pivot
        System.out.println("Test 7: Duplicates Around Pivot");
        myLinkedList = new LinkedListPartition(5);
        myLinkedList.append(1);
        myLinkedList.append(5);
        myLinkedList.append(0);
        myLinkedList.append(5);
        myLinkedList.partitionList(5);
        System.out.println("Original List: 5 -> 1 -> 5 -> 0 -> 5");
        System.out.println("Expected: 1 -> 0 -> 5 -> 5 -> 5");
        myLinkedList.printList();
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            List: (empty)
            Expected: empty
            empty

            Test 2: Single Node (< x)
            List: 1
            Expected: 1
            1

            Test 3: Single Node (>= x)
            List: 5
            Expected: 5
            5

            Test 4: All Nodes < x
            List: 1 -> 2 -> 0
            Expected: 1 -> 2 -> 0
            1 -> 2 -> 0

            Test 5: All Nodes >= x
            List: 5 -> 6 -> 7
            Expected: 5 -> 6 -> 7
            5 -> 6 -> 7

            Test 6: Mixed Nodes
            Original List: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
            Expected: 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10
            3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10

            Test 7: Duplicates Around Pivot
            Original List: 5 -> 1 -> 5 -> 0 -> 5
            Expected: 1 -> 0 -> 5 -> 5 -> 5
            1 -> 0 -> 5 -> 5 -> 5
        */

    }
}
