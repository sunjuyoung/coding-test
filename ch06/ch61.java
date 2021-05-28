package ch06;

public class ch61 {
    public static void main(String[] args) {
        
        int [] ar = {4,6,7,8,9,5,3,2};

        for(int j=0; j<ar.length; j++){
            for(int i=j+1; i<ar.length; i++){
                if(ar[j]>ar[i]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i]=temp;
                }
              
            }
        }

        for(int a : ar){
            System.out.println(a);
        }
     
    }
}
