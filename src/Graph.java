import java.util.LinkedList;

public class Graph {
    private LinkedList<Vertex> vertices;

    public Graph() {
        vertices = new LinkedList<Vertex>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addEdgeConnection(Vertex v1, Vertex v2, int distance) {
        if(!vertices.contains(v1)) {
            vertices.add(v1);
        }
        if(!vertices.contains((v2))) {
            vertices.add(v2);
        }

        v1.addNeighbor(v2, distance);
        v2.addNeighbor(v1, distance);
    }

    public LinkedList<Vertex> getVertices() {
        return vertices;
    }

    public void printVertices() {
        for(int i = 0; i < this.getVertices().size(); i++) {
            Vertex vertex = this.getVertices().get(i);
            LinkedList<Edge> edges = vertex.getEdges();
            for(int j = 0; j < edges.size(); j++) {
                Edge edge = edges.get(j);
                System.out.printf("Initial: %s, Final: %s, Distance: %d\n",
                        edge.getInitial().getName(), edge.getFinal().getName(),
                        edge.getDistance());
            }
        }
    }
}
