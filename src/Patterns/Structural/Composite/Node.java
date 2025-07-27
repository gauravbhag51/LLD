package Patterns.Structural.Composite;

public abstract class Node {
    String name;
    DirectoryNode parent;

    Node(String name)
    {
        this.name = name;
    }

    String getPath(){
        if(parent == null) return name;
        return parent.getPath()+"/"+name;
    }
    abstract boolean isDirectory();

}
