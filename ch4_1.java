import java.util.Scanner;

/**
 * ch4_1
 */
public class ch4_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nx =0;
        int ny =0;

        int[][]arr = new int[n][n];

        sc.nextLine();

        String [] str = sc.nextLine().split(" ");
       
       
        for(int i=0; i<str.length; i++){

            System.out.println(str[i]);
            switch (str[i]) {
                case "L":if(nx<=0){continue;} nx-=1;     break;
                case "R":if(nx>5){continue;} nx+=1;      break;
                case "U":if(ny<0){continue;} ny-=1;      break;
                case "D":if(ny>5){continue;} ny+=1;      break;
            }
        }

        System.out.printf("%3d,%3d",nx,ny);


   
    }
}