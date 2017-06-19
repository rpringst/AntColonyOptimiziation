public class Main {
    public static void main(String args[]){
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Graph graph = new Graph();
        graph.addEdgeConnection(v1, v2, 1);
        graph.addEdgeConnection(v2, v3, 1);
        graph.addEdgeConnection(v3, v1, 1);
        graph.printVertices();
    }
}
