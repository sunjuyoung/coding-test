package ch03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ch3_22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        System.out.println("m:");
        int m = sc.nextInt();
        System.out.println("k:");
        int k = sc.nextInt();

        int []arr = new int[n];
        IntStream.rangeClosed(0, n-1).forEach(i->{
            System.out.println(i+"번재 번호:");
            arr[i]=sc.nextInt();
        });

        Arrays.sort(arr);

        int first = arr[n-1];
        int second = arr[n-2];

        //가장 큰 수가 더해지는 횟수
        int count = (int)(m/(k+1)) * k;
        count+= (m%(k+1));

        int result = count * first;
        result += (int)(m/(k+1)) * second;

        System.out.println("--");
       for(int i : arr){
           System.out.printf("%3d",i);
       }

       System.out.println("--");
       System.out.println(result);

        

    }
}
