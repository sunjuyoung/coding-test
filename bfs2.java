import java.util.Scanner;
import java.util.stream.Stream;

/**
 * bfs2
 */
public class bfs2 {

    public static int [][]graph =null;
    public static int n =0;
    public static int m =0;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int result = 0;

         n = sc.nextInt();
         m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기
         graph =  new int[n][m];

        
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

           
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(bfs(i, j)){
                    result +=1;
                }
                
            }
        }

    }


    static boolean bfs(int x, int y ){
        if(x <= -1 || y<= -1 || x>=n || y>= m){
            return false;
        }
        if(graph[x][y] == 1){
            graph[x][y] = 0;

            bfs(x - 1, y);
            bfs(x, y - 1);
            bfs(x + 1, y);
            bfs(x, y + 1);
            return true;
        }

        return false;
    }

    static boolean dfs(int x, int y ){

        if(x <= -1 || y<= -1 || x>=n || y>= m){
            return false;
        }

        if(graph[x][y] == 1){
            graph[x][y] = 0;

            bfs(x - 1, y);
            bfs(x, y - 1);
            bfs(x + 1, y);
            bfs(x, y + 1);
            return true;
        }

        return false;
    }
}