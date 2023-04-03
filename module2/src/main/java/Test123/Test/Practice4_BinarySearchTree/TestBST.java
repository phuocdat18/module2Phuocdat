package JavaCollectionFramework.Practice4_BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("1");
        tree.insert("5");
        tree.insert("4");
        tree.insert("7");
        tree.insert("6");
        tree.insert("9");
        tree.insert("3");
        //traverse tree
        System.out.println("Đặt hàng (sắp xếp): ");
        tree.inorder();
        System.out.println("Số lượng: " + tree.getSize());
    }
}