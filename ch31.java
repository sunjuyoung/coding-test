import java.util.Scanner;

/**
 * ch31 거스름돈
 */
public class ch31 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] coins = {500,100,50,10};

        System.out.println("가격 : ");
        int price = sc.nextInt();
        int count=0;

        for(int i=0; i<coins.length; i++){
            if(coins[i]< price){
                count += price / coins[i];
                price = price % coins[i];
            }
        }

System.out.println(count);

    }
}