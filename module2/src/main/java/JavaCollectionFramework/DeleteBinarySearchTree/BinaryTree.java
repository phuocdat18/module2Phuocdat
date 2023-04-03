package JavaCollectionFramework.DeleteBinarySearchTree;


public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Phương thức đệ qui để duyệt cây theo thứ tự trước
    void preOrderTraversal(Node node) {
        if (node == null)
            return;

        // Duyệt cây con bên trái đệ qui
        preOrderTraversal(node.left);

        // Duyệt cây con bên phải đệ qui
        preOrderTraversal(node.right);

        // Truy cập nút hiện tại
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);

        System.out.println("Cây nhị phân theo thứ tự trước:");
        tree.preOrderTraversal(tree.root);
    }
}