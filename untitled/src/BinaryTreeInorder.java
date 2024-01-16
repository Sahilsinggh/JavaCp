

public class BinaryTreeInorder {
    class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }



    Node root;
    static int sum =0;
    BinaryTreeInorder() {
        root = null;
    }

    public void makeTree() {
//        TreeChildSum tree = new TreeChildSum();
        this.root = new Node(1);
        this.root.left = new Node(2);
        this.root.right = new Node(3);
        this.root.left.left = new Node(4);
        this.root.left.right = new Node(5);
    }
    public static void inOrderTraversal(Node treeNode) {

        if(treeNode == null) {
            return;
        }
        inOrderTraversal(treeNode.left);
            sum +=treeNode.key;
            System.out.print(treeNode.key + " ");
        inOrderTraversal(treeNode.right);


    }
    public static void main(String[] args) {
        BinaryTreeInorder binaryTreeInorder = new BinaryTreeInorder();
        binaryTreeInorder.makeTree();
        inOrderTraversal(binaryTreeInorder.root);
        System.out.println("sum :" + sum);
    }
}
