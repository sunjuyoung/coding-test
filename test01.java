import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.management.RuntimeErrorException;



public class test01 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        
       System.out.println("몇장?(1~10) :");
       int howManyNumber = sc.nextInt();
       if(howManyNumber==0)throw new RuntimeErrorException(null);
       int howManyCount = 0;
        Map<Integer,int[]> arrr = new HashMap<>();
        //List<int[]> arr1 =new ArrayList<>();

        int [] num1 = null;
        int [] preNum = {19,21,30,33,34,42};

        System.out.println("중복 가능 개수: ");
        int duplicationNumber = sc.nextInt();

    while(true){
        num1 = new int[6];
        while(true){
            numbers(num1);
            start(num1);

            if(duplicationNumber >=5)break;
            int duplicationCounter = arrayDuplicationCheck(num1, preNum);
            if(duplicationNumber >= duplicationCounter){
               break;
           }
      }
            ++howManyCount;
            Arrays.sort(num1);
            arrr.put(howManyCount, num1);
            if(howManyCount==howManyNumber){
               break;
            }
    }
      
    System.out.println("");
        arrr.forEach((i,in)->{
                System.out.printf("%d번째 :",i);
            for(int j : in){
                System.out.printf("%3d",j);
            }
            System.out.println("");
        });       


    }

    static int arrayDuplicationCheck(int[]num1,int[]preNum){
        int Cnt=0;
        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num1.length; j++){
                if(num1[j]==preNum[i]){
                    ++Cnt;
                }
            }
        }
        return Cnt;
    }

 
    static void start(int [] num1){
        while(true){
            if(!duplicationCheck(num1)){
                numbers(num1);
            }else{
                break;
            }
        }

    }

    static boolean duplicationCheck(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1+i; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }

        return true;
    }


    static int[] numbers(int[] arr){
        IntStream.rangeClosed(0, 5).forEach(i->{
            arr[i] = (int)(Math.random()*45)+1;
        });

        return arr;
    }
    

    
}
