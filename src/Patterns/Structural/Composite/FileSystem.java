package Patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    DirectoryNode root;

    FileSystem()
    {
        this.root = new DirectoryNode("");
    }

    void mkdir(String path){
        String[] parts = path.split("/");
        DirectoryNode crr = root;
        for(String part: parts)
        {
            if(part.isEmpty()) continue;
            Node next = crr.get(part);
            if(next == null)
            {
                DirectoryNode newDir = new DirectoryNode(part);
                crr.add(newDir);
                crr = newDir;
            }else if( next.isDirectory())
            {
                crr = (DirectoryNode) next;
            }else{
                throw new RuntimeException("Path component is a file: "+ part);
            }
        }
    }

    void touch(String path)
    {
        int lastSlash = path.lastIndexOf("/");
        String dirPath = path.substring(0,lastSlash);
        String fileName = path.substring(lastSlash+1);
        mkdir(dirPath);
        DirectoryNode dir = getDirectory(dirPath);
        FileNode file = new FileNode(fileName);
        dir.add(file);
    }

    List<String> find(String name)
    {
        List<String> result = new ArrayList<>();
        dfs(root, name, result);
        return  result;

    }

    private void dfs(Node node, String name, List<String> result)
    {
        if(node.name.equals(name)){
            result.add(node.getPath());
        }

        if(node.isDirectory()){
            for(Node child: ((DirectoryNode)node).children.values()){
                dfs(child, name, result);
            }
        }
    }

    private DirectoryNode getDirectory(String path)
    {
        String[] parts = path.split("/");
        DirectoryNode crr = root;
        for(String part: parts)
        {
            if(part.isEmpty()) continue;
            Node next = crr.get(part);
            if(next == null || !next.isDirectory())
            {
                throw new RuntimeException("Invalid directory path: "+part);
            }
            crr=(DirectoryNode) next;
        }
        return crr;
    }
}
