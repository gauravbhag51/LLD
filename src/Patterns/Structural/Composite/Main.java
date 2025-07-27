package Patterns.Structural.Composite;

import java.util.List;

public class Main {
    public static void main(String[] args){
        FileSystem fs = new FileSystem();
        fs.mkdir("/gaurav/hello/world");
        fs.touch("/gaurav/hello/world/hello");
        fs.touch("/gaurav/hello/world/world");

        List<String> results = fs.find("hello");
        for(String dir: results){
            System.out.println(dir);
        }
    }
}
