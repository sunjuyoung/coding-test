package ch03;

import java.util.Arrays;
import java.util.Scanner;

public class ch3_3 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("행: ");
        int r = sc.nextInt();
        System.out.println("열: ");
        int c = sc.nextInt();

        int[][]arr = new int[r][c];

        System.out.println("숫자 입력 :");
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

      
        for(int [] ar : arr){
            Arrays.sort(ar);
        }

        int []arr2 = new int [r];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr[i][0];
        }

        System.out.println("-------------");
        for(int ar : arr2){
            System.out.println(ar);
        }
        

    }
    
}
