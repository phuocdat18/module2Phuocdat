package Test123.Test.Practice4_BinarySearchTree;

import JavaCollectionFramework.DeleteBinarySearchTree.BinarySearchTree;

import java.util.Scanner;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    public boolean add(Scanner scanner) {
        System.out.print("Nhập giá trị muốn thêm: ");
        String input = scanner.next();
        E e = null;
        if (e == null) {
            throw new NullPointerException("Không thể thêm phần tử null vào cây");
        }
        if (root == null) {
            root = new TreeNode<>(e);
            size++;
            return true;
        }

        TreeNode<E> parent = null;
        TreeNode<E> current = root;
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
            parent.left = new TreeNode<>(e);
        } else {
            parent.right = new TreeNode<>(e);
        }

        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
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