package co.edu.uptc;

public class Node <T>{
    private T info;
    private Node<T> lowest = null;
    private Node<T> highest = null;

    public Node(T info){
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Node<T> getLowest() {
        return lowest;
    }
    public void setLowest(Node<T> lowest) {
        this.lowest = lowest;
    }
    public Node<T> getHighest() {
        return highest;
    }
    public void setHighest(Node<T> highest) {
        this.highest = highest;
    }

    

}
