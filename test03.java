import java.util.Arrays;
import java.util.List;

import javax.sound.midi.Soundbank;

public class test03 {
    public static void main(String[] args) {
    

        System.out.println(gcd1(60, 24));



    }

    public static int gcd(int a, int b){
        
        int i =a;
        if(a>b){
            i = b;
        }

        while(true){
            if(a%i ==0 && b%i ==0){
                return i;
               
            }
            i =i-1;
        }

    }

    public static int gcd1(int a, int b){

        if(b==0)return a;

        return gcd1(b,a % b);
    }
}
