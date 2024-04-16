// Node.java
package src.main.java.GraphComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class Node implements GraphComponent {
    private String id;
    private List<GraphComponent> connectedNodes = new ArrayList<>();

    public Node(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void connectTo(GraphComponent node) {
        connectedNodes.add(node);
    }

    @Override
    public void display() {
        for (GraphComponent node : connectedNodes) {
            System.out.println("Node " + id + " is connected to Node " + ((Node)node).getId());
        }
    }
}