public class BinarySearchTree {
    public static node insert(node root, node new_node) {
        if (root == null) {
            root = new_node;

        }
        if (root.data > new_node.data) {
            if (root.left == null) {
                root.left = new_node;
            }
            else {
                insert(root.left, new_node);
            }



        }
        else if (root.data < new_node.data) {
            if (root.right == null) {
                root.right = new_node;
            } else {
                insert(root.right, new_node);
            }
        }


            return root;

    }
    public static  void postOrderTraversal(node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }
    //to get predecessor and successsor
    //predecessor: max value on left hand side of tree
    //Successor: min value on right hand side of tree
    public static void successor(node root) {
        if (root == null) {
            System.out.println("tree is empty");

        }
        else {
            node temp = root.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            System.out.println("Successor value is: "+temp.data);

        }
    }
    public static void predecessor(node root){
        if(root==null){
            System.out.println("empty");
        }
        else {
            node temp = root.left;
            while(temp.right!=null) {
                temp = temp.right;
            }
            System.out.println("Predecessor value is: "+temp.data);

            }
        }
    }









