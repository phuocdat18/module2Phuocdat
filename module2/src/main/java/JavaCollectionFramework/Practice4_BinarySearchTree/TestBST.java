package JavaCollectionFramework.Practice4_BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("Đạt");
        tree.insert("Bằng");
        tree.insert("Thi");
        tree.insert("Pháp");
        tree.insert("Hưng");
        tree.insert("Nghĩa");
        tree.insert("Hoàn");
        //traverse tree
        System.out.println("Đặt hàng (sắp xếp): ");
        tree.inorder();
        System.out.println("Số lượng: " + tree.getSize());
    }
}