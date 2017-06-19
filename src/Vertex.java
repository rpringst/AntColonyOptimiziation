import java.util.LinkedList;

public class Vertex {
    private String name;
    private LinkedList<Edge> edges;

    public Vertex(String name) {
        this.name = name;
        edges = new LinkedList<Edge>();
    }

    public void addNeighbor(Vertex neighbor, int distance) {
        Edge edge = new Edge();
        edge.setEdge(this, neighbor, distance);
        edges.add(edge);
    }

    public int distanceToNeighbor(Vertex neighbor) {
        return 0;
    }

    public LinkedList<Edge> getEdges() {
        return edges;
    }

    public String getName() {
        return name;
    }
}
