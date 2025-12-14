package rBST;

public class Main {

    public static void main(String[] args) {
//        RecursiveBinarySearchTree myBst = new RecursiveBinarySearchTree();
//
//        myBst.insert(47);
//        myBst.insert(21);
//        myBst.insert(76);
//        myBst.insert(18);
//        myBst.insert(27);
//        myBst.insert(52);
//        myBst.insert(82);
//
//        System.out.println("\nBST Contains 27:");
//        System.out.println(myBst.rContains(27));
//
//        System.out.println("\nBST Contains 17:");
//        System.out.println(myBst.rContains(17));

//        RecursiveBinarySearchTree myBst = new RecursiveBinarySearchTree();
//        myBst.insert(2);
//        myBst.insert(1);
//        myBst.insert(3);
//
//        System.out.println("\nRoot " + myBst.root.value);
//        System.out.println("\nRoot->Left: " + myBst.root.left.value);
//        System.out.println("\nRoot->Right: " + myBst.root.right.value);

//        RecursiveBinarySearchTree myBst = new RecursiveBinarySearchTree();
//        myBst.insert(47);
//        myBst.insert(21);
//        myBst.insert(76);
//        myBst.insert(18);
//        myBst.insert(27);
//        myBst.insert(52);
//        myBst.insert(82);
//
//        System.out.println(myBst.minValue(myBst.root));
//        System.out.println(myBst.minValue(myBst.root.right));

        RecursiveBinarySearchTree myBst = new RecursiveBinarySearchTree();
        myBst.insert(2);
        myBst.insert(1);
        myBst.insert(3);

        System.out.println("\nRoot: " + myBst.root.value);
        System.out.println("Root->Left: " + myBst.root.left.value);
        System.out.println("Root->Right: " + myBst.root.right.value);

        myBst.deleteNode(2);

        System.out.println("\nRoot: " + myBst.root.value);
        System.out.println("Root->Left: " + myBst.root.left.value);
        System.out.println("Root->Right: " + myBst.root.right);
    }

}
