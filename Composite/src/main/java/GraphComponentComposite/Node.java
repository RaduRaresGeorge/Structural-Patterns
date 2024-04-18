package src.main.java.GraphComponentComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a node in the context of a composite design pattern.
 * It implements the GraphComponent interface and manages a list of connected nodes.
 */
public class Node implements GraphComponent {
    /**
     * The id of the node.
     */
    private String id;
    /**
     * A list of nodes connected to this node.
     */
    private List<GraphComponent> connectedNodes = new ArrayList<>();

    /**
     * Constructs a new node with a specified id.
     *
     * @param id the id of the node
     */
    public Node(String id) {
        this.id = id;
    }

    /**
     * Returns the id of the node.
     *
     * @return the id of the node
     */
    public String getId() {
        return id;
    }

    /**
     * Connects this node to another node.
     *
     * @param node the node to be connected to this node
     */
    public void connectTo(GraphComponent node) {
        connectedNodes.add(node);
    }

    /**
     * Displays this node and the nodes connected to it.
     * For each connected node, it prints the id of this node and the id of the connected node.
     */
    @Override
    public void display() {
        for (GraphComponent node : connectedNodes) {
            System.out.println("Node " + id + " is connected to Node " + ((Node)node).getId());
        }
    }
}