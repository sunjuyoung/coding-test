package ch07;

public class ch72 {
    
    public static void main(String[] args) {
        
    }


    static int search(int[] array, int start, int end, int target){

        if(start > end){
            return -1;

        }
        int mid = (start+end) / 2;

        if(array[mid] == target){
            return mid;
        }


        if(array[mid] > target){
            return search(array, start, mid-1, target);
        }else{
            return search(array, mid+1, end, target);
        }
        

      

    }
}
