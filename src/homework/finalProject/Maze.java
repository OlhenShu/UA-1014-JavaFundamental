package homework.finalProject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Maze {
    private int numOfNodes;
    private int height;
    private int width;
    Node node;
    static Scanner sc = new Scanner(System.in);
    Set<Integer> allWay = new HashSet<>();
    List<Integer> finalNode = new ArrayList<>();
    List<Integer> bodyOfMaze = new ArrayList<>();

    public int getNumOfNodes() {
        return numOfNodes;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public Maze(int height, int width) {
        this.height = height;
        this.width = width;
        this.numOfNodes = height * width;
        node = new Node(numOfNodes);
        for (int i = 0; i < (this.numOfNodes); i++){
            if(((i+1) % this.width) == 0){
                this.finalNode.add(i);
            }else if((!((i % this.width) == 0)) && (i>width) && (i <(numOfNodes-width))){
                this.bodyOfMaze.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Want to build a maze?!");
        int height = readIntegerInput("Please, enter the height of the maze: ");
        int width = readIntegerInput("Please, enter the width of the maze: ");
        Maze maze = new Maze(height, width);

        generateMaze(maze);

        System.out.println("\n New maze \n");
        printGraph(maze);

        System.out.print("\n Do you want to save this maze? (yes/no): ");
        sc.nextLine();
        if (sc.nextLine().toLowerCase().equals("yes")) {
            saveMaze(maze);
            System.out.println("Your maze has been successfully saved.");
        } else {
            System.out.println("Good Bye!");
        }
    }
    static void generateMaze (Maze maze) throws InterruptedException {
        addRibs(maze);
        int firstWalkway = firstWalkway(maze);
        maze.node.addWalkway(firstWalkway, maze.node.getTrueWalkway());
        buildMaze(maze,firstWalkway);
        while (!checkExit(maze)) {
            var build = new Thread(new Walls(maze));
            build.start();
            build.join();
        }
        checkWalls(maze);
    }
    static int readIntegerInput(String text) {
        System.out.print(text);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next();
            }
        }
    }
    static void addRibs (Maze maze){
        int numOfNodes = maze.getNumOfNodes();
        int width = maze.getWidth();
        for (int i = 0; i < (maze.getNumOfNodes()); i++) {
            if((i == numOfNodes)||(i <= (width-1))||
                    ((i+width) >= numOfNodes)){
                continue;
            }else {
                if(((i+1) % (width)) == 0) {
                    addVerticalRibs(maze, i);
                }else {
                    maze.node.addEdge(i, i+1);
                    addVerticalRibs(maze, i);
                }
            }
        }
    }
    static void addVerticalRibs(Maze maze, int i){
        maze.node.addEdge(i, (i + maze.getWidth()));
    }

    static int firstWalkway(Maze maze){
        int numOfNodes = maze.getNumOfNodes();
        int width = maze.getWidth();
        int firstW = (numOfNodes- (width*(int)((Math.random()*maze.getHeight()))));
        if ((firstW == 0)||(firstW == (numOfNodes- width)) || (firstW == numOfNodes)){
            return firstWalkway(maze);
        }else {
            return firstW;
        }
    }
    static void buildMaze(Maze maze, int i){
        List<Integer> edgeNode;
        Set<Integer> neighbors = maze.node.neighbors(i);

        edgeNode = neighbors.stream().filter(node ->
                        (node < (maze.getNumOfNodes() - maze.getWidth()) && (!((node % (maze.getWidth())) == 0))
                                && (!(node == maze.node.getTrueWalkway())))
                        ).toList();

        if (!edgeNode.isEmpty()) {
            int n = (int)(Math.random() * edgeNode.size());
            int nextNode = edgeNode.get(n);
            if (haveWays(maze, nextNode, 2)) {
                maze.node.addWalkway(nextNode, maze.node.getTrueWalkway());
                maze.allWay.add(nextNode);
            }
        }
    }

    static Boolean checkExit(Maze maze) {
        int trueWalkway = maze.node.getTrueWalkway();
        for (int i = 0; i < (maze.finalNode.size()); i++){
            int node = maze.finalNode.get(i);
            if(maze.node.neighbors(node).contains(trueWalkway)){
                return true;
            }
        }
        return false;
    }

    static Boolean haveWays(Maze maze, int n, int numberWays){
        int trueWalkway = maze.node.getTrueWalkway();
        List<Integer> ways = new ArrayList<>();
        for (Integer nodes : maze.node.neighbors(n)) {
            if (!(nodes == trueWalkway)) {
                if (maze.node.neighbors(nodes).contains(trueWalkway)) {
                    ways.add(nodes);
                }
            }
        }
        return ways.size() < numberWays;
    }

    static void checkWalls(Maze maze) {
        List<Integer> blockMazeSize = new ArrayList<>();
        int mazeSize = maze.bodyOfMaze.size();
        int trueWalkway = maze.node.getTrueWalkway();
        for (int i = 0; i < mazeSize; i++) {
            int node = maze.bodyOfMaze.get(i);
            if (!(node == trueWalkway)&&(haveWays(maze,node,1))){
                List<Integer> list = maze.node.neighbors(node).stream().filter(n ->
                                (!(n == trueWalkway)) &&
                                (haveWays(maze, n, 1))).toList();
                if (list.size() > 0) {
                    blockMazeSize.add(node);
                    maze.node.addWalkway(node, trueWalkway);
                }
            }
        }
        //return blockMazeSize.size() != 0;
    }
    static void printGraph(Maze maze){
        for (int i = 0; i < maze.getNumOfNodes(); i++) {
            if ((i % maze.getWidth()) == 0) {
                System.out.print("\n");
            }
            if (maze.node.neighbors(i).contains(maze.node.getTrueWalkway())) {
                System.out.print("  ");
            } else {
                System.out.print("\u2588\u2588");
            }
        }
    }
    static String writeGraph(Maze maze){
        StringBuilder stringGraph = new StringBuilder();
        for (int i = 0; i < maze.getNumOfNodes(); i++) {
            if ((i % maze.getWidth()) == 0) {
                stringGraph.append("\n");
            }
            if (maze.node.neighbors(i).contains(maze.node.getTrueWalkway())) {
                stringGraph.append("  ");
            } else {
                stringGraph.append("\u2588\u2588");
            }
        }
        return stringGraph.toString();
    }
    static void saveMaze (Maze maze){
        try {
            String fileName = "src/homework/finalProject/file1.txt";
            var file = new File(fileName);
            String text1 = writeGraph(maze);
            Files.writeString(file.toPath(), text1, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class Walls implements Runnable {
        Maze maze;
        public Walls(Maze maze) {
            this.maze = maze;
        }
        @Override
        public void run() {
            int n = (int) (Math.random() * maze.allWay.size());
            List<Integer> list = new ArrayList<>(maze.allWay);
            int nextNode = list.get(n);
            buildMaze(maze, nextNode);
        }
    }
}

class Node{
    private List<Set<Integer>> node;
    final private int trueWalkway = -33;

    public Node(int numOfNodes) {
        node = new ArrayList<>(numOfNodes);
        for (int i = 1; i <= numOfNodes; i++) {
            node.add(new HashSet<>());
        }
    }

    public void addEdge(int node1, int node2) {
        node.get(node1).add(node2);
        node.get(node2).add(node1);
    }
    public void addWalkway(int node1, int walkway) {
        node.get(node1).add(walkway);
    }

    public Set<Integer> neighbors(int n) {
        return node.get(n);
    }

    public int getTrueWalkway() {
        return trueWalkway;
    }
}

