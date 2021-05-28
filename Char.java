import java.util.Scanner;

/**
 * Char
 */
public class Char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int result = 0;

         int n = sc.nextInt();
         int x = 1; 
         int y = 1;
        
         int [][] arr= new int[n][n];

         int[] dx = {-1,1,0,0};
         int[] dy = {0,0,-1,1};

         sc.nextLine();
         String ar = sc.nextLine();   
         String [] str =ar.split(" ");
         String [] moveType = {"L","R","U","D"};

         for(int i=0; i<str.length; i++){
            int nx = -1, ny = -1;
            for(int j=0; j<moveType.length; j++){
                if(str[i] == moveType[j]){
                     nx = x + dx[j];
                     ny = y + dy[j]; 
                }
            }
            if(nx < 1 || ny <1 || nx >n || ny >n){
                continue;
            }
            x = nx;
            y = ny;

         }

         System.out.println(x);
         System.out.println(y);
      

    }
}