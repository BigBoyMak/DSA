import java.util.List;
import java.util.Stack;

public class DFS {

    //graph or tree as node class
    public void dfs(Node node){
        if(node == null)
            return;

        //base condition

        for(Node child: node.children){
            dfs(child);
        }
    }

    //graph as adjacency list
    public void dfs(List<Integer>[] graph, int node, boolean[] visited) {

        //base case

        if(visited[node])
            return;

        visited[node] = true;

        for(Integer child: graph[node]){
            dfs(graph, child, visited);
        }
    }

    //iterative dfs
    public void dfsIterative(List<Integer>[] graph, int node, boolean[] visited){
        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            Integer currentNode = stack.pop();
            if(visited[currentNode])
                continue;

            visited[currentNode] = true;

            //some logic

            for(Integer child: graph[currentNode]){
                if(!visited[child])
                    stack.push(child);
            }
        }
    }



}
