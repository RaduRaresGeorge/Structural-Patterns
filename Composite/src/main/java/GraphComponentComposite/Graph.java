package GraphComponentComposite;

public class Graph {
    public static void main(String[] args) {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        node1.connectTo(node2); // Connect node1 to node2
        node2.connectTo(node3); // Connect node2 to node3

        CompositeNode compositeNode = new CompositeNode("4");
        compositeNode.add(node1);
        compositeNode.add(node2);
        compositeNode.add(node3);

        compositeNode.display();
    }
}