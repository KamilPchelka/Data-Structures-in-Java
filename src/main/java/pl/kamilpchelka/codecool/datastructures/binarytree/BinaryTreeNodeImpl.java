package pl.kamilpchelka.codecool.datastructures.binarytree;

public class BinaryTreeNodeImpl implements BinaryTreeNode {

    int data;

    BinaryTreeNodeImpl right;
    BinaryTreeNodeImpl left;

    public BinaryTreeNodeImpl(int value) {
        this.data = value;
    }

    @Override
    public void add(int value) {


        if (value <= data) {

            if (left == null) {
                left = new BinaryTreeNodeImpl(value);
            } else {
                left.add(value);
            }
        } else {

            if (right == null) {
                right = new BinaryTreeNodeImpl(value);
            } else {
                right.add(value);
            }

        }
    }

    @Override
    public boolean contains(int value) {

        if (data == value) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printPreOrder() {

        System.out.print(data + " ");

        if (left != null) {
            left.printPreOrder();
        }


        if (right != null) {
            right.printPreOrder();
        }

    }

    public void printInOrder() {

        System.out.print(data + " ");

        if (left != null) {
            left.printInOrder();
        }


        if (right != null) {
            right.printInOrder();
        }

    }

    public void printPostOrder() {

        if (left != null) {
            left.printInOrder();
        }


        if (right != null) {
            right.printInOrder();
        }

        System.out.print(data + " ");
    }


}
