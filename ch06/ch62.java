package ch06;

public class ch62 {
    
    public static void main(String[] args) {
        
        int [] ar = {4,6,7,8,9,5,3,2};

        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(ar[j]<ar[j-1]){
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        for(int a : ar){
            System.out.println(a);
        }
     

    }
}
