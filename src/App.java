import co.edu.uptc.BinaryTree;
import co.edu.uptc.Person;

public class App {
    public static void main(String[] args) throws Exception {
       BinaryTree binaryTree = new BinaryTree();

       Person p1 = new Person("Oscar", "Roa");
       Person p2 = new Person("David", "Aguilar");
       Person p3 = new Person("German", "Amezquita");
       
       
       binaryTree.add(p1);
       binaryTree.add(p2);  
       binaryTree.add(p3);
       
       binaryTree.showList();

    }
}
