package linkedListLeetCode;

public class MainLinKedListSwapPair {

    public static void main(String[] args) {
        LinKedListSwapPairs myLinKedListSwapPairs;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinKedListSwapPairs = new LinKedListSwapPairs(1);
        myLinKedListSwapPairs.makeEmpty();
        myLinKedListSwapPairs.swapPairs();
        System.out.println("Expected: empty");
        myLinKedListSwapPairs.printList();
        System.out.println();

        // Test 2: Single node (no swap)
        System.out.println("Test 2: Single Node");
        myLinKedListSwapPairs = new LinKedListSwapPairs(10);
        myLinKedListSwapPairs.swapPairs();
        System.out.println("Expected: 10");
        myLinKedListSwapPairs.printList();
        System.out.println();

        // Test 3: Two nodes (swap them)
        System.out.println("Test 3: Two Nodes");
        myLinKedListSwapPairs = new LinKedListSwapPairs(1);
        myLinKedListSwapPairs.append(2);
        myLinKedListSwapPairs.swapPairs();
        System.out.println("Expected: 2 -> 1");
        myLinKedListSwapPairs.printList();
        System.out.println();

        // Test 4: Odd number of nodes (3 nodes)
        System.out.println("Test 4: Odd Length List");
        myLinKedListSwapPairs = new LinKedListSwapPairs(1);
        myLinKedListSwapPairs.append(2);
        myLinKedListSwapPairs.append(3);
        myLinKedListSwapPairs.swapPairs();
        System.out.println("Expected: 2 -> 1 -> 3");
        myLinKedListSwapPairs.printList();
        System.out.println();

        // Test 5: Even number of nodes (4 nodes)
        System.out.println("Test 5: Even Length List");
        myLinKedListSwapPairs = new LinKedListSwapPairs(1);
        myLinKedListSwapPairs.append(2);
        myLinKedListSwapPairs.append(3);
        myLinKedListSwapPairs.append(4);
        myLinKedListSwapPairs.swapPairs();
        System.out.println("Expected: 2 -> 1 -> 4 -> 3");
        myLinKedListSwapPairs.printList();
        System.out.println();

        // Test 6: Longer list (6 nodes)
        System.out.println("Test 6: Longer List (6 Nodes)");
        myLinKedListSwapPairs = new LinKedListSwapPairs(1);
        for (int i = 2; i <= 6; i++) myLinKedListSwapPairs.append(i);
        myLinKedListSwapPairs.swapPairs();
        System.out.println("Expected: 2 -> 1 -> 4 -> 3 -> 6 -> 5");
        myLinKedListSwapPairs.printList();
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            Expected: empty
            empty

            Test 2: Single Node
            Expected: 10
            10

            Test 3: Two Nodes
            Expected: 2 -> 1
            2 -> 1

            Test 4: Odd Length List
            Expected: 2 -> 1 -> 3
            2 -> 1 -> 3

            Test 5: Even Length List
            Expected: 2 -> 1 -> 4 -> 3
            2 -> 1 -> 4 -> 3

            Test 6: Longer List (6 Nodes)
            Expected: 2 -> 1 -> 4 -> 3 -> 6 -> 5
            2 -> 1 -> 4 -> 3 -> 6 -> 5
        */
    }
}
