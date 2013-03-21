package graph;

/**
 *
 * @author Dawid Półchłopek
 */
public class Graph {

    private int[] head;
    private List next[];
    private int graph_size;

    public Graph(int n, int m){
        
        head = new int[n];
        next = new List[m];
        //do dodania do graph
        //automatyczna alokacja tych wszystkich rzeczy
        //ale nie wpisywania danych
        this.graph_size = graph_size;
    }
    
    
    
    public double getVertex() {
        return 1;
    }
    
    public double getEdge() {
        return 1;
    }
    
    public double getNextEdge() {
        return 1;
    }
    
//    public double addElement(String twoNumbers) {
//        
//    }
    
    
}
//z milosza projektu dodac

class List {
    public int value;
    public List next;
    
    List(int value) {
        this.value = value;
        this.next = null;
    }
}