package graph;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 *
 * @author Dawid Półchłopek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String input_file = args[0];
        int graph_size = Integer.parseInt(args[1]);
        int number = 0;
        
        //TODO jak policzyć ładnie to "m"
        int m = 0;
        //liczba wierzchołków graph_size = n
        //tutaj ma byc zastosowane wpisywanie do struktury grafowej
        Graph data = new Graph(graph_size, m);
        
        FileReader fileReader = new FileReader(input_file);
        
        StreamTokenizer st = new StreamTokenizer(fileReader);

        try {
            while( (number = st.nextToken()) != StreamTokenizer.TT_EOF ){
                System.out.println("liczba: "+ st.nval);
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        //bufferedReader.close();
        
    }
}
