package JavaCollectionFramework.DeleteBinarySearchTree;

public class BinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;

        public Node(E element) {
            this.element = element;
        }
    }

    // Phương thức tìm kiếm
    public boolean contains(E e) {
        Node<E> current = root;
        while (current != null) {
            int cmp = e.compareTo(current.element);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    // Phương thức thêm phần tử
    public boolean add(E e) {
        if (root == null) {
            root = new Node<>(e);
            size++;
            return true;
        }

        Node<E> parent = null;
        Node<E> current = root;
        while (current != null) {
            int cmp = e.compareTo(current.element);
            if (cmp == 0) {
                return false; // Phần tử đã tồn tại trong cây
            } else if (cmp < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }

        if (e.compareTo(parent.element) < 0) {
            parent.left = new Node<>(e);
        } else {
            parent.right = new Node<>(e);
        }

        size++;
        return true;
    }

    // Phương thức xóa phần tử
    public boolean delete(E e) {
        Node<E> current = root;
        Node<E> parent = null;

        // Tìm nút chứa phần tử cần xóa và nút cha của nó
        while (current != null) {
            int cmp = e.compareTo(current.element);
            if (cmp == 0) {
                break;
            } else if (cmp < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }

        // Nếu không tìm thấy phần tử, trả về false
        if (current == null) {
            return false;
        }

        // Xóa phần tử
        if (current.left == null) { // Trường hợp 1: current không có node con trái
            if (parent == null) { // current là nút gốc
                root = current.right;
            } else if (current == parent.left) { // current là nút con trái của parent
                parent.left = current.right;
            } else { // current là nút con phải của parent
                parent.right = current.right;
            }
        } else { // Trường hợp 2: current có node con trái
            Node<E> rightMost = current.left;
            Node<E> parentOfRightMost = current;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }
            current.element = rightMost.element;
            if (parentOfRightMost.right == rightMost) { // rightMost không có node con phải
                parentOfRightMost.right = rightMost.left;
            } else { // rightMost là nút con trái của parentOfRightMost
                parentOfRightMost.left = rightMost.left;
            }
        }
        size--;
        return true;

    }
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new JavaCollectionFramework.DeleteBinarySearchTree.Node(27);
//        tree.root.left = new JavaCollectionFramework.DeleteBinarySearchTree.Node(14);
//        tree.root.right = new JavaCollectionFramework.DeleteBinarySearchTree.Node(35);
//        tree.root.left.left = new JavaCollectionFramework.DeleteBinarySearchTree.Node(10);
//        tree.root.left.right = new JavaCollectionFramework.DeleteBinarySearchTree.Node(19);
//        tree.root.right.left = new JavaCollectionFramework.DeleteBinarySearchTree.Node(31);
//        tree.root.right.right = new JavaCollectionFramework.DeleteBinarySearchTree.Node(42);
//
//        System.out.println("Cây nhị phân theo thứ tự trước:");
//        tree.preOrderTraversal(tree.root);
//    }
}