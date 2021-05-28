import java.util.ArrayList;
import java.util.List;

public class dfs1 {

    public static boolean[] visited = new boolean[9];
   // public static List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {

        int[][] graph= {
            {},
            {2,3,8},
            {1,7},
            {1,4,5},
            {3,5},
            {3,4},
            {7},
            {2,6,8},
            {1,7}
        };
        dfs(1,graph);
    }

    public static void dfs(int x, int[][] graph){

        visited[x] = true;
        System.out.println(x + "");

        for(int i=0; i<graph[x].length; i++){
            int y = graph[x][i];
            if(!visited[y]){
                dfs(y,graph);
            }
            
        }

    }


}
