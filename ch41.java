import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node{

    private int x;
    private int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

}

public class ch41 {
    public static int n, m;
    public static int[][] graph = null;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

          n = sc.nextInt();
          m = sc.nextInt();

        
      
         graph = new int[n][m];
         sc.nextLine();
         for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
         System.out.println(bfs(0,0));
    }


    static int bfs(int x,int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        

        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny <0 || nx >= n || ny >= m){
                    continue;
                }

                if(graph[x][y] == 0){
                    continue;
                }

                if(graph[nx][ny]== 1){
                    graph[nx][ny] = graph[x][y] +1;
                    q.offer(new Node(nx, ny));
                }

            }

        }
        return graph[n-1][m-1];
    }


}
