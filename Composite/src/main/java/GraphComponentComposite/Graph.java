package src.main.java.GraphComponentComposite;

/**
 * This class represents a graph that uses the composite design pattern.
 * It creates a composite node, adds nodes to the composite node, and displays the composite node and its child nodes.
 */
public class Graph {

    /**
     * The main method of this class.
     * It creates a composite node, adds nodes to the composite node, and displays the composite node and its child nodes.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // Create individual nodes
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        // Connect node1 to node2 and node2 to node3
        node1.connectTo(node2);
        node2.connectTo(node3);

        // Create a composite node and add individual nodes to it
        CompositeNode compositeNode = new CompositeNode("4");
        compositeNode.add(node1);
        compositeNode.add(node2);
        compositeNode.add(node3);

        // Display the composite node and its child nodes
        compositeNode.display();
    }
}