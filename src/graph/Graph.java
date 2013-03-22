package graph;

import java.util.LinkedList;

/**
 *
 * @author Dawid Półchłopek
 */
public class Graph {

    private int head[];
    private LinkedList<Integer> next[];
//    private List head[];
//    private List next[];
    private int graph_size;
    
    public Graph(int n, int m){
        this.graph_size = n;
        head = new int[2*m - 1];
        next = new LinkedList[2*m + graph_size - 1];
//        head = new List[2*m - 1];
//        next = new List[2*m + graph_size - 1];
        //do dodania do graph
        //automatyczna alokacja tych wszystkich rzeczy
        //ale nie wpisywania danych
        
    }
    
    /** Dodawanie nowego elementu do grafu
     * 
     * @param point wierzchołek do dodania
     * @param value wartość dookola do dodania
     */
//    public void addLink(int point, int value) {
//        if (this.head[point].next == null) {
//            this.next[point] = new List(value);
//            this.head[point].next = this.next[point];
//        } else {
//            
//        }
//    }
    public void addLink(int point, int value) {
        //sprawdza czy jest pusty
        if(this.head[point] == 0) {
            //dodaje pierwszy element do next
            this.next[point].addFirst(value);
            //dodaje wskaznik z head do next
            this.head[point] = point;
            //dodanie nowego wierzchołka
            //trzeba dodawac nowy pusty wierzcholek do listy?
            //this.head[point].add(head); 
        } else {
            this.next[point].addLast(value);
        }
    }
    
    public double getVertex(int point) {
        return this.head[point];
    }
    
    /**
     * Znajduje krawedz w strukturze grafu
     * @param pointStart wierzcholek krawedzi
     * @param pointEnd koniec krawedzi
     * @return 
     */
    public int getEdge(int pointStart, int pointEnd) {
        int i = 0;
        if (this.head[pointStart] != 0) {
            while(this.next[pointStart] != null) {
                if(this.next[pointStart].get(i) == pointEnd) {
                    return i;
                }
                return 0;
            }
        }   
        return 0;
    }

    
    
}

//
//class List {
//    public int value;
//    public List next;
//    
//    List(int value) {
//        this.value = value;
//        this.next = null;
//    }
//}