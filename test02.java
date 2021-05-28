import java.util.Arrays;
import java.util.Scanner;

public class test02 {
   public static void main(String[] args) {
       System.out.println(300/10);

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b= sc.nextInt();

       int[][]arr = new int[a][b];
       int[] arr1 = new int[a];

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               arr[i][j] = sc.nextInt();
              
           }
           Arrays.sort(arr[i]);
           arr1[i]= arr[i][0];
       }

       Arrays.sort(arr1);

      

      

       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
           System.out.printf("%3d",arr[i][j]);
           
        }System.out.println("");
       
    }

    for(int j=0; j<arr[0].length; j++){
        System.out.println(arr1[j]);
        
     }
     System.out.println(arr1[a-1]);




        


   } 
}
