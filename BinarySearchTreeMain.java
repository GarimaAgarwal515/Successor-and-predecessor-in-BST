public class BinarySearchTreeMain {
    public static void main(String[] args) {
        node root = new node(80);
        node n1 = new node(70);
        node n2 = new node(100);
        node n3 = new node(150);
        node n4 = new node(90);
        node n5 = new node(85);
        node n6 = new node(95);
        node n7 = new node(75);
        node n8 = new node(60);
        BinarySearchTree.insert(null, root);
        BinarySearchTree.insert(root , n1);
        BinarySearchTree.insert(root, n2);
        BinarySearchTree.insert(root, n3);
        BinarySearchTree.insert(root, n4);
        BinarySearchTree.insert(root, n5);
        BinarySearchTree.insert(root, n6);
        BinarySearchTree.insert(root, n7);
        BinarySearchTree.insert(root, n8);

        BinarySearchTree.postOrderTraversal(root);
        BinarySearchTree.successor(root);
        BinarySearchTree.predecessor(root);




    }
}
