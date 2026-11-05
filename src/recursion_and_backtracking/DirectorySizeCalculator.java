package recursion_and_backtracking;

import java.util.*;

public class DirectorySizeCalculator {

    static class Node {
        String name;
        int size;
        boolean isDirectory;
        ArrayList<Node> children;

        Node(String name, int size, boolean isDirectory) {
            this.name = name;
            this.size = size;
            this.isDirectory = isDirectory;
            children = new ArrayList<>();
        }
    }

    static int calculateSize(Node node) {

        // Base case
        if (!node.isDirectory) {
            return node.size;
        }

        int totalSize = 0;

        for (Node child : node.children) {
            totalSize += calculateSize(child);
        }

        return totalSize;
    }

    public static void main(String[] args) {

        Node project = new Node("project", 0, true);

        Node src = new Node("src", 0, true);
        Node docs = new Node("docs", 0, true);
        Node guides = new Node("guides", 0, true);

        Node main = new Node("main.java", 100, false);
        Node utils = new Node("utils.java", 50, false);
        Node readme = new Node("readme.txt", 10, false);
        Node setup = new Node("setup.pdf", 200, false);
        Node config = new Node("config.xml", 20, false);

        src.children.add(main);
        src.children.add(utils);

        guides.children.add(setup);

        docs.children.add(readme);
        docs.children.add(guides);

        project.children.add(src);
        project.children.add(docs);
        project.children.add(config);

        int total = calculateSize(project);

        System.out.println("Total Directory Size: " + total + " KB");
    }
}