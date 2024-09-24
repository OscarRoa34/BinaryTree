package co.edu.uptc;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root = null;

    public BinaryTree() {

    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> found = searchNode(value);
            if (value.compareTo(found.getInfo()) > 0) { 
                found.setHighest(newNode);
            } else {
                found.setLowest(newNode);
            }
        }
    }

    private Node<T> searchNode(T value) {
        Node<T> aux = root;
        while (true) {
            if (value.compareTo(aux.getInfo()) > 0 && aux.getHighest() != null) {
                aux = aux.getHighest();
            } else if (value.compareTo(aux.getInfo()) <= 0 && aux.getLowest() != null) {
                aux = aux.getLowest();
            } else {
                return aux;
            }
        }
    }

    public void showList() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<T> node) {
        if (node != null) {
            inOrderTraversal(node.getLowest());
            System.out.print(node.getInfo() + " ");
            inOrderTraversal(node.getHighest());
        }
    }
}
