// CompositeNode.java
package GraphComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements GraphComponent {
    private List<GraphComponent> children = new ArrayList<>();
    private String id;

    public CompositeNode(String id) {
        this.id = id;
    }

    public void add(GraphComponent component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Composite Node: " + id);
        for (GraphComponent child : children) {
            System.out.println("Node " + ((Node)child).getId() + " is connected to Composite Node: " + id);
            child.display();
        }
    }
}