package TreeTraversalLeetCode;

import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public Integer kthSmallest(int k){
        Stack<Node> results = new Stack<>() ;

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.push(currentNode);

                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
            }
        }


        new Traverse(root);
        int nodeSize = results.size();
        for(int i = 0 ; i<nodeSize;i++){

            if(i == k-1){
                return results.pop().value;
            }
            results.pop();
        }


        return null;
    }


}

