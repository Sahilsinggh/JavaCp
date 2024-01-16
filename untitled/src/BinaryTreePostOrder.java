public class BinaryTreePostOrder {
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
    BinaryTreePostOrder(){
        this.root = null;
    }
  //  BinaryTreePreOrder.Node root;
    public static void main(String[] args) {
        BinaryTreePostOrder BtPostOrder = new BinaryTreePostOrder();
        BtPostOrder.makeTree();
        PostOrderTraversal(BtPostOrder.root);
    }

    private static void PostOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.key+" ");
    }

    public void makeTree() {
//        TreeChildSum tree = new TreeChildSum();
        this.root = new Node(1);
        this.root.left = new Node(2);
        this.root.right = new Node(3);
        this.root.left.left = new Node(4);
        this.root.left.right = new Node(5);
    }

}
