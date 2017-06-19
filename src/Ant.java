import java.util.LinkedList;

public class Ant {
    private LinkedList<Vertex> path;
    private LinkedList<Boolean> visited;
    private int concentration = -1;
    private int evaporation = -1;
    private int distanceCovered = -1;

    public Ant(int pheromoneConc, int pheromoneEvap, int graphSize) {
        concentration = pheromoneConc;
        evaporation = pheromoneEvap;
        path = new LinkedList<Vertex>();
        visited = new LinkedList<Boolean>();
        for(int i = 0; i < graphSize; i++){
            visited.add(Boolean.FALSE);
        }
    }
}
