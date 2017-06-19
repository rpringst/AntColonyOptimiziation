public class Edge {
    private int distance = -1;
    private Vertex v1, v2;

    public Edge () {

    }

    private void setEndpoints(Vertex start, Vertex end) {
        v1 = start;
        v2 = end;
    }

    private void setDistance(int distance) {
        this.distance = distance;
    }

    public void setEdge(Vertex start, Vertex end, int distance) {
        this.setEndpoints(start, end);
        this.setDistance(distance);
    }
    public Vertex getInitial() {
        return v1;
    }

    public Vertex getFinal() {
        return v2;
    }

    public int getDistance() {
        return distance;
    }
}
