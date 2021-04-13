import java.util.Arrays;
import java.util.Scanner;

/* 큰수의 법칙 */
public class ch32 {
    public static void main(String[] args) {
        
        int []numbers = {5,7,9,2,4,1};

        Scanner sc = new Scanner(System.in);

        System.out.println("더하기 횟수:");
        int M =sc.nextInt();
        System.out.println("연속 횟수:");
        int K =sc.nextInt();

        int cnt =0;

        Arrays.sort(numbers);

        int sum = 0;

        System.out.println(Arrays.toString(numbers));

        for(int i=0; i<M; i++){
            if(cnt<K){
                sum += numbers[numbers.length-1];
            }else{
                sum+=numbers[numbers.length-2];
                cnt =0;
            }
            cnt+=1;
        }

        System.out.println(sum);
    }
}
