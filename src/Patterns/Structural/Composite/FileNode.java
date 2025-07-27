package Patterns.Structural.Composite;

public class FileNode extends Node{
    FileNode(String name)
    {
        super(name);
    }
    @Override
    boolean isDirectory(){return false;}
}
