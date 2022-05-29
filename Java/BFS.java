import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public void bfs(List<Integer>[] graph, int node, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            Integer currentNode = queue.poll();

            if(visited[currentNode])
                continue;
            visited[currentNode] = true;

            //some logic

            for(Integer child: graph[currentNode]){
                if(!visited[child])
                    queue.add(child);
            }
        }
    }

}
