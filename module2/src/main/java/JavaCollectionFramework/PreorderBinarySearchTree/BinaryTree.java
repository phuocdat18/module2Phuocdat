package JavaCollectionFramework.PreorderBinarySearchTree;

public class BinaryTree {
    Node root;
    public BinaryTree() {
        root = null;
    }
    void printPreorder(Node node) {
        if (node == null)
            return;
        printPreorder(node.left);
        System.out.print(node.key + " ");
        printPreorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.println("Trình tự duyệt trước của cây nhị phân là:");
        tree.printPreorder(tree.root);
    }
}
