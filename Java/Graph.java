import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Graph {
    //edge: [src, dest, cost]

    //If the graph nodes are increasing order integers (index values are considered as nodes & number of nodes are given):

    public List<int[]>[] createGraph(int[][] edges, int n){

        List<int[]>[] graph = new List[n]; // size can be n+1 if node starts from 1

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge: edges) {
            int src = edge[0], dest = edge[1], cost = edge[2];
            graph[src].add(new int[] {dest, cost} );

            //can add only dest as Integer if there’s no cost

            // if edge is undirected, need to add the reverse path also
            graph[dest].add(new int[] {src, cost} );
        }

        return graph;
    }

    //If the graph node values could be anything, need to create adjacency list as hashmap:

    public HashMap<Integer, List<Integer>> createGraph(int[][] edges) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        for(int[] edge: edges){
            int src = edge[0], dest = edge[1];

            if(!graph.containsKey(src))
                graph.put(src, new ArrayList<>());

            if(!graph.containsKey(dest))
                graph.put(dest, new ArrayList<>());

            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }

        return graph;
    }

    //for testing
    public static void main(String[] args){
        Graph graph = new Graph();
        int[][] edges = {{1,2,2}, {1, 3, 3}, {1, 4, 3}, {2, 3, 4}, {3, 4, 2}};
        System.out.println(graph.createGraph(edges));
    }


}
