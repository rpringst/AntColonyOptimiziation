import java.util.LinkedList;

public class Ant {
    private LinkedList<Vertex> path;
    private int concentration = -1;
    private int evaporation = -1;

    public Ant(int pheromoneConc, int pheromoneEvap, int graphSize) {
        concentration = pheromoneConc;
        evaporation = pheromoneEvap;
        path = new LinkedList<Vertex>();
    }

    public Boolean addVisit(Vertex vertex) {
        if(this.hasVisited(vertex)){
            return Boolean.FALSE;
        }
        else {
            path.add(vertex);
            return Boolean.TRUE;
        }
    }

    public int getDistance() {
        if(path.size() == 0) {
            return 0;
        }
        else{
            int total = 0;
            for (int i = 0; i < path.size()-1; i++) {
                total+=path.get(i).distanceToNeighbor(path.get(i+1));
            }
            return total;
        }
    }

    public int getConcentrationRate() {
        return concentration;
    }

    public int getEvaporationRate() {
        return evaporation;
    }

    private Boolean hasVisited(Vertex vertex) {
        return path.contains(vertex);
    }

    public void printPath() {
        for(int i = 0; i<path.size(); i++){
            System.out.println(path.get(i).getName());
        }
    }
}
