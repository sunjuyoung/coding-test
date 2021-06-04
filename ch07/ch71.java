package ch07;

import java.util.Scanner;

public class ch71 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] ar = {"erg","wreg","wer","gbfd","fff","wew"};

        String x = sc.next();
        
        for(int i=0; i<ar.length; i++){
            if(x.equals(ar[i])){
                System.out.printf("%3d 번째에 있다",i+1);
            }
        }

    }
}
