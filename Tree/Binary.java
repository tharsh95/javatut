package Tree;
public class Binary {
    static void preOrderTraversal(Node curr) {
        if (curr == null)
            return;
        System.out.print(curr.data + " ");
        preOrderTraversal(curr.left);
        preOrderTraversal(curr.right);
    }
    static void inOrderTrav(Node curr){
        if(curr==null){
            return;
        }
        inOrderTrav(curr.left);
        System.out.print(curr.data + " ");
        inOrderTrav(curr.right);
    }
    static void postOrderTrav(Node curr){
        if(curr==null){
            return;
            
        }
        postOrderTrav(curr.left);
        postOrderTrav(curr.right);
        System.out.print(curr.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        // preOrderTraversal(root);
        // inOrderTrav(root);
        postOrderTrav(root);

    }

}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}