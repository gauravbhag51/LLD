package Patterns.Structural.Composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectoryNode extends Node{
    Map<String, Node> children = new HashMap<>();
    DirectoryNode(String name)
    {
        super(name);
    }
    @Override
    public boolean isDirectory(){return true;}

    void add(Node node)
    {
        node.parent = this;
        children.put(node.name, node);
    }
    void remove(String name)
    {
        children.remove(name);
    }
    Node get(String name){
        return children.get(name);
    }
}
