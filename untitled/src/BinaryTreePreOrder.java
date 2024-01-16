public class BinaryTreePreOrder {
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
    BinaryTreePreOrder(){
        this.root = null;
    }
    public static void main(String[] args) {
        BinaryTreePreOrder BtPreOrder = new BinaryTreePreOrder();
        BtPreOrder.makeTree();
        preOrderTraversal(BtPreOrder.root);
    }

    public void makeTree() {
//        TreeChildSum tree = new TreeChildSum();
        this.root = new Node(1);
        this.root.left = new Node(2);
        this.root.right = new Node(3);
        this.root.left.left = new Node(4);
        this.root.left.right = new Node(5);
    }

    private static void preOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.key+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


}
